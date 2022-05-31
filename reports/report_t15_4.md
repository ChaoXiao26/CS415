# Team 15: Iteration Four Report

### Selected Project: commons-lang

This iteration we worked on benchmarking regression test tools on an unmodified version of commons-lang. In this report, we've included averages of all the performance data that we collected for Ekstazi and HyRTS, along with several visualizations. Included are instructions on how to run the Python script that was used to clone the repository, inject all of the necessary dependencies, and collect all of the relevant performance metrics.

## To Run
From the RTS directory:

```python run_rts.py```

This script clones into the commons-lang repository and runs tests for all of the tools. The relevant outputs are written to data.csv. We ran this script using at least Python version 3.7 or higher on a Windows machine. 

Note on running: This script can take over 30 minutes to run due to the fact that a typical run through the commons-lang test suite takes about 30 seconds and we're doing this 3 times for 20 different commits along with other operations.

## Data Averages
| Files | LOC    | Changed | All Tests | Ekstazi Tests | HyRTS Tests | All Duration | Ekstazi Duration | HyRTS Duration | Ekstazi Time Reduction | HyRTS Time Reduction | Ekstazi Test Suite Reduction | HyRTS Test Suite Reduction |
|-------|--------|---------|-----------|---------------|-------------|--------------|------------------|----------------|------------------------|----------------------|------------------------------|----------------------------|
| 326.4 | 143552 | 6.45    | 4103.15   | 1206.4        | 656.45      | 25.37805     | 13.9791          | 8.47885        | 0.451955107            | 0.669063312          | 0.706028199                  | 0.840048711                |

## Analysis
The script was able to successfully run with all 20 of the commits, taking over 30 minutes to get through all of the tests which included over 4,000 tests per commit. HyRTS tended to be more performant than Ekstazi, however Ekstazi was still showing great time reduction without ignoring quite as many tests. Throughout the 20 commit iterations, we saw an average time reduction of around 45% for Ekstazi and 67% for HyRTS. Ekstazi seems to be a safer tool since it still ran through an average of about 30% of the tests but if time reduction is an absolute priority, HyRTS is a better solution.
 
This library is a perfect candidate for regression test selection since the test suite often took over 25 seconds to run. Even just running our script we were able to see the benefits in the overall time reduction that regression test selection offers since the tests for commons-lib took an incredibly long time to run. Some of the issues that we noted is that it didn't take many file changes in order for the entire test suite to need to be tested again by the RTS tools. For example, on the final commit there are only 25 files changed from the version of the repository 5 commits prior, yet Ekstazi and HyRTS both had to run all 4121 tests. The downside to this is that when all of the tests need to run, the RTS tools could take even longer than just running all of the tests normally. Given our results, regression test selection still seems like a great solution for large code bases, where major changes are infrequent.
 
Unfortunately, we weren't able to include benchmarks for OpenClover since it didn't work well with commons-lib. The problem that we ran into was that OpenClover was making changes to input variables in the reflection tests which were being caught by the test assertions and failing. Outside of methods testing reflection, OpenClover did work well, however, we opted to use HyRTS instead in order to avoid having to disable any of the original tests.


## Visualization
![Reduction vs Commit Number](/reports/Minning_report_files/ReductionVsCommitNumberBar.png)

![Reduction vs Commit Number](/reports/Minning_report_files/ReductionVsCommitNumberLine.png)

![Reduction vs Files Changed](/reports/Minning_report_files/ReductionVsFilesChanged.png)

![Total Test Averages](https://user-images.githubusercontent.com/68512532/167229144-ac439fa6-f410-4874-827a-34205a7c3fb6.png)

![Total Duration Comparison](https://user-images.githubusercontent.com/68512532/167229158-8452053b-6450-4e52-9f68-0319dcee98e7.png)

![Time Reduction Averages](https://user-images.githubusercontent.com/68512532/167229037-5f843002-8d5c-4e80-a45c-186270091f6c.png)

![Test Suite Reduction Comparison](https://user-images.githubusercontent.com/68512532/167229184-57745081-9a0d-4e88-90c8-64700b0a453e.png)



## Iteration Four Reflection

### What went well
In this iteration, we were able to set up a weekly meeting time and location. In order to ensure that everyone had the same understanding of the course material and the task, we all worked together. For this iteration's development, we were successful in creating a script that worked as expected.
### What could have gone better
As in previous rounds, we were having difficulty keeping track of our progress due to a lack of adequate planning. A big part of this was due to the many challenges we encountered when attempting to troubleshoot our work environments. While this was an improvement over our previous iterations, we did leave the bulk of our work to the final week. Despite this, we were able to come up with a solution.
