# Will Daknis: Iteration Two Report

### Selected Packages: 
[org.apache.commons.lang3.compare](/completeproject/src/main/java/org/apache/commons/lang3/compare/)
[org.apache.commons.lang3.event](/completeproject/src/main/java/org/apache/commons/lang3/event/)
[org.apache.commons.lang3.stream](/completeproject/src/main/java/org/apache/commons/lang3/stream/)

## Testing Details:

### [CompareUtilsTest.java](/completeproject/src/test/java/org/apache/commons/lang3/compare/CompareUtilsTest.java)
| Test Name | Class | Method | Strategy | Descripiton |
|-----------|-------|--------|----------|-------------|
| leExecutesAndReturnsSomething() | CompareUtils | le | Input Space Partioning | The entirety of this class is done using Input Space Partitioning. In an ideal world, my tests for this method and the three written below would be performed in each nested class. However, I do not currently have the knowledge to test generics or the Predicate class, so I added tests that ensure the methods will work. |
| ltExecutesAndReturnsSomething() | CompareUtils | lt | Input Space Partioning | Similar description as leExecutesAndReturnsSomething() | 
| geExecutesAndReturnsSomething() | CompareUtils | ge | Input Space Partioning | Similar description as leExecutesAndReturnsSomething() | 
| gtExecutesAndReturnsSomething() | CompareUtils | gt | Input Space Partioning | Similar description as leExecutesAndReturnsSomething() |

### [EventUtilsTest.java](/completeproject/src/test/java/org/apache/commons/lang3/event/EventUtilsTest.java)
| Test Name | Class | Method | Strategy | Descripiton |
|-----------|-------|--------|----------|-------------|
| testAddEventListenerIllegalAccessException() | EventUtils | addEventListener() | Graph-Based Coverage | Graph-Based Coverage can be used to show that there are four ways addEventListener can execute-no exception, NoSuchMethodException, IllegalAccessException, and InvocationTargetException. From this observation, I was able to determine that there wasn't a test case for IllegalAccessException. I added a test that should throw such an exception within the method and add to the method's line coverage. This would give the package nearly 100% testing for each class, methods, line, and branch. |

### [StreamsTest.java](/completeproject/src/test/java/org/apache/commons/lang3/stream/StreamsTest.java)
| Test Name | Class | Method | Strategy | Descripiton |
|-----------|-------|--------|----------|-------------|
| testAnyMatch() | FailableStream | anyMatch() | Input Space Partioning | Input Space Partioning can be used to test no matches, any match, and all match by changing properties of the stream and FailablePredicate that are associated with the method. This is difficult to do as I've had no education or experience testing non-static methods or objects with generic parameters. This test will be implemented in the next iteration. |
| testAllMatch() | FailableStream | allMatch() | Input Space Partioning | Similar description as testAnyMatch() |
