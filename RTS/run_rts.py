import os
import re
import subprocess
import glob
import time

EKSTAZI = """
			<plugin>
				<groupId>org.ekstazi</groupId>
				<artifactId>ekstazi-maven-plugin</artifactId>
				<version>5.3.0</version> 
				<executions>
					<execution>
						<id>ekstazi</id>
						<goals>
							<goal>select</goal>
						</goals>
					</execution>
				</executions>
			</plugin>\n"""

CLOVER = """
			<plugin>
				<groupId>org.openclover</groupId>
				<artifactId>clover-maven-plugin</artifactId>
				<version>4.4.1</version>     
			</plugin>\n"""

HYRTS = """
			<plugin>
				<groupId>org.hyrts</groupId>
				<artifactId>hyrts-maven-plugin</artifactId>
				<version>1.0.1</version>
			</plugin>\n"""


def injectDependencies():
	with open("pom.xml", "r+") as pom:
		contents = pom.readlines()
		for i, line in enumerate(contents):
			if "<groupId>org.ekstazi</groupId>" in line:
				break

			#We don't use OpenClover but I'll leave this in just in case.
			# if "<groupId>org.openclover</groupId>" in line:
			# 	break

			if "<groupId>org.hyrts</groupId>" in line:
				break

			if "</build>" in line:
				contents.insert(i-2, EKSTAZI + HYRTS)
				pom.seek(0)
				pom.writelines(contents)
				break

def skipRat():
	with open("pom.xml", "r+") as pom:
		contents = pom.readlines()
		for i, line in enumerate(contents):
			if "<artifactId>apache-rat-plugin</artifactId>" in line:
				if "<skip>true</skip>" not in contents[i + 2]:
					contents.insert(i+2, '\t' * 6 + "<skip>true</skip>\n")
					pom.seek(0)
					pom.writelines(contents)
				break


def getMavenOutputs(commands):
	outputs = subprocess.run(commands, shell=True, capture_output=True).stdout.decode('utf-8')
	tests = re.findall('Tests run: (\d+)', outputs)[-1]
	duration = re.search('Total time:  (\d+\.\d+)', outputs).group(1)
	return tests, duration


def getLinesOfCode(source_files):
	loc = 0
	for file in source_files:
		file_lines = sum(1 for _ in open(file, encoding='utf8')) #This isn't a very fast solution, I couldn't find a good alternative to wc.
		loc += int(file_lines)

	return loc


def getFilesChanged(commit):
	output = subprocess.run(['git', '--no-pager', 'log', '--first-parent',
	'--pretty=tformat'"%H", '--max-count=6'], shell=True, capture_output=True).stdout.decode('utf-8')
	
	prior_commit = output.splitlines()[-1].removeprefix('tformat')
	changed = subprocess.run(['git', 'diff', '--name-only', commit, prior_commit], shell=True, capture_output=True).stdout.decode('utf-8')
	changed_list = [item for item in changed.splitlines() if ".java" in item]
	
	return changed_list 
	

def main():
	start_time = time.time()
	
	#step 1
	if not os.path.isdir(os.getcwd() + "/commons-lang/"):
		subprocess.check_call(['git', 'clone', 'https://github.com/apache/commons-lang'])
	
	os.chdir('commons-lang')
	subprocess.run(["git", "restore", "pom.xml"], shell=True) #Just in case we run this again after an error.
	
	#step 2
	subprocess.run(['git', 'checkout', '3e44d26342654c8b2d8caba924ff468dd0e6e700'], capture_output=True)
	
	#step 3
	output = subprocess.Popen(['git', '--no-pager', 'log', '--first-parent',
	 '--pretty=tformat'"%H", '--max-count=100'], stdout=subprocess.PIPE).communicate()[0]
	output = output.decode("utf-8")
	output = output.replace('tformat', '')
	commits = output.split('\n')
	commits.pop(len(commits)-1)
	i = len(commits)-1
	commit_list = []
	while(i>0):
		commit_list.append(commits[i])
		i-=5

	#step 4
	outputs = {}
	for i, commit in enumerate(commit_list):
		outputs[commit] = {}
		
		#4a
		print(f"Checking out commit {i + 1}: {commit}")
		subprocess.run(['git', 'checkout', commit], capture_output=True)

		#4b
		print(f"Running all tests...")
		all_tests, all_duration = getMavenOutputs(['mvn', 'test'])
		outputs[commit]["all_tests"] = all_tests
		outputs[commit]["all_duration"] = all_duration

		#4c
		injectDependencies()

		#4d
		skipRat()
		
		subprocess.run(['mvn', 'clean', 'compile'], shell=True, capture_output=True)

		#4e
		print("Running Ekstazi...")
		ekstazi_tests, ekstazi_duration = getMavenOutputs(['mvn', 'ekstazi:ekstazi'])
		outputs[commit]["ekstazi_tests"] = ekstazi_tests
		outputs[commit]["ekstazi_duration"] = ekstazi_duration

		#4f Clover can't be run without dissabling one of the reflection test files because it causes tests to fail.
		# print("Running OpenClover...")
		# clover_tests, clover_duration = getMavenOutputs(['mvn', 'clover:setup', 'clover:optimize', 'test', 'clover:snapshot'])
		# outputs[commit]["clover_tests"] = clover_tests
		# outputs[commit]["clover_duration"] = clover_duration

		#4f alt
		print("Running HyRTS...")
		hyrts_tests, hyrts_duration = getMavenOutputs(['mvn', 'hyrts:HyRTS'])
		outputs[commit]["hyrts_tests"] = hyrts_tests
		outputs[commit]["hyrts_duration"] = hyrts_duration

		subprocess.run(["git", "restore", "pom.xml"], shell=True) #Revert the changes to pom.xml so that we can checkout next hash


		#4g
		source_files = glob.glob("./src/**/*.java", recursive=True)

		outputs[commit]["files"] = len(source_files)
		outputs[commit]["loc"] = getLinesOfCode(source_files) 
		outputs[commit]["changed"] = len(getFilesChanged(commit))
		outputs[commit]["ekstazi_time_reduction"] = (float(all_duration)-float(ekstazi_duration))/float(all_duration)
		outputs[commit]["hyrts_time_reduction"] = (float(all_duration)-float(hyrts_duration))/float(all_duration)
		outputs[commit]["ekstazi_test_suite_reduction"] = (int(all_tests)-int(ekstazi_tests))/int(all_tests)
		outputs[commit]["hyrts_test_suite_reduction"] = (int(all_tests)-int(hyrts_tests))/int(all_tests)

		timestamp = time.time() - start_time
		minutes = int(timestamp / 60)
		print(f"Current run duration: {minutes:02d}:{int(timestamp - (minutes * 60)):02d}")
	
	timestamp = time.time() - start_time
	minutes = int(timestamp / 60)
	print(f"Tests finished. Total run duration: {minutes:02d}:{int(timestamp - (minutes * 60)):02d}")

	#step 5
	os.chdir('..')
	dataToCollect = ['hashcode', 'files', 'loc', 'changed', 'all_tests', 'ekstazi_tests', 'hyrts_tests', 'all_duration', 'ekstazi_duration', 'hyrts_duration', 'ekstazi_time_reduction', 'hyrts_time_reduction', 'ekstazi_test_suite_reduction', 'hyrts_test_suite_reduction']

	with open('data.csv', 'w') as file:
		file.write(','.join(dataToCollect))
		for commit in commit_list:
			file.write('\n' + commit)
			for key in dataToCollect[1:]:
				file.write(',' + str(outputs[commit][key]))


if __name__=='__main__':
	main()
