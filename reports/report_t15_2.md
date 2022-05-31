# Team 15: Iteration Two Report

### Selected Project: [commons-lang](/completeproject)

For this iteration our team focused on using input space partitioning and graph-based coverage strategies to improve our overall line and branch coverage. The following tables include information on the current test coverage for our chosen packages and files. Each package section includes links to reports with additional information on changes in test coverage and details on the individual tests. Included at the end of the report is a reflection on how this iteration went for our team. 

## Project Coverage:
| Package                                                                                                | Class Coverage | Method Coverage | Line Coverage  | Branch Coverage | Mutation Coverage |
|--------------------------------------------------------------------------------------------------------|----------------|-----------------|----------------|-----------------|-------------------| 
| [org.apache.commons.lang3.reflect](/completeproject/src/main/java/org/apache/commons/lang3/reflect/)   | 100% (12/12)   | 97% (186/191)   | 90% (994/1094) | 68% (248/360)   | 82% (645/790)     |
| [org.apache.commons.lang3.function](/completeproject/src/main/java/org/apache/commons/lang3/function/) | 100%  (39/39)  | 99% (165/166)   | 94% (249/246)  | 91% (32/35)     | 88% (206/234)     |
| [org.apache.commons.lang3.stream](/completeproject/src/main/java/org/apache/commons/lang3/stream/)   | 100% (4/4)   | 81% (27/33)     | 74% (35/47)    | 66% (2/3)       | 56% (24/43)       |
| [org.apache.commons.lang3.compare](/completeproject/src/main/java/org/apache/commons/lang3/compare/)   | 100% (3/3)   | 90% (20/22)     | 94% (36/38)    | 100% (23/23)    | 69% (44/64)       |
| [org.apache.commons.lang3.event](/completeproject/src/main/java/org/apache/commons/lang3/event/)   | 100% (4/4)   | 100% (23/23)    | 94% (65/69)    | 87% (7/8)       | 86% (19/22)       |

## Package Coverage:

### [org.apache.commons.lang3.reflect](/completeproject/src/main/java/org/apache/commons/lang3/reflect/) - Chad Minning
#### [Reflect Coverage Overview](/reports/Minning_report_files/reflect_overview_2.md) | [Minning Test Details](/reports/Minning_report_files/report_minning_2.md)
| File                                                                                                             | Method Coverage | Line Coverage | Branch Coverage | Mutation Coverage |
|------------------------------------------------------------------------------------------------------------------|-----------------|---------------|-----------------|-------------------|
| [ConstructorUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java)   | 100% (9/9)      | 100% (51/51)  | 91% (11/12)     | 95% (20/21)       |
| [FieldUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/FieldUtils.java)               | 100% (35/35)    | 99% (128/129) | 76% (19/25)     | 93% (70/75)       |
| [IheritanceUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/InheritanceUtils.java)    | 100% (2/2)      | 100% (11/11)  | 100% (5/5)      | 91% (10/11)       |
| [MemberUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/MemberUtils.java)             | 100% (22/22)    | 98% (92/93)   | 81% (35/43)     | 84% (92/110)      |
| [MethodUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java)             | 100% (32/32)    | 95% (237/247) | 80% (57/71)     | 88% (130/147)     |
| [TypeLiteral.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/TypeLiteral.java)             | 100% (6/6)      | 100% (15/15)  | 100% (2/2)      | 90% (9/10)        |
| [TypeUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java)                 | 94% (80/85)     | 83% (460/548) | 58% (119/202)   | 75% (314/416)     |


### [org.apache.commons.lang3.function](/completeproject/src/main/java/org/apache/commons/lang3/function/) - Yuxin Huang
[report_Huang_2.md](/reports/Huang_report_files/report_Huang_2.md)

| File                                                                                                                                    | Method Coverage | Line Coverage | Branch Coverage | Mutation Coverage |
|-----------------------------------------------------------------------------------------------------------------------------------------|-----------------|---------------|-----------------|-------------------|
| [BooleanConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/BooleanConsumer.java)                           | 100%            | 100%          | 100%            | 100%              |
| [Failable.java](/completeproject/src/main/java/org/apache/commons/lang3/function/Failable.java)                                         | 100%            | 92%           | 66%             | 76%               |
| [FailableBiConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableBiConsumer.java)                     | 100%            | 100%          | 100%            | 100%              |
| [FailableBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableFunction.java)                       | 100%            | 100%          | 100%            | 67%               |
| [FailableBiPredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableBiPredicate.java)                   | 100%            | 100%          | 100%            | 100%              |
| [FailableConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableConsumer.java)                         | 100%            | 86%           | 100%            | 75%               |
| [FailableDoubleConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleConsumer.java)             | 100%            | 100%          | 100%            | 100%              |
| [FailableDoubleFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleFunction.java)             | 100%            | 100%          | 100%            | 100%              |
| [FailableDoublePredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoublePredicate.java)           | 100%            | 100%          | 100%            | 100%              |
| [FailableDoubleToIntFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleToIntFunction.java)   | 100%            | 100%          | 100%            | 100%              |
| [FailableDoubleToLongFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleToLongFunction.java) | 100%            | 100%          | 100%            | 100%              |
| [FailableDoubleUnaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleUnaryOperator.java)   | 100%            | 100%          | 100%            | 71%               |
| [FailableFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableFunction.java)                         | 100%            | 100%          | 100%            | 71%               |
| [FailableIntConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntConsumer.java)                   | 100%            | 86%           | 100%            | 100%              |
| [FailableIntFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntFunction.java)                   | 100%            | 100%          | 100%            | 100%              |
| [FailableIntPredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntPredicate.java)                 | 100%            | 100%          | 100%            | 100%              |
| [FailableIntToDoubleFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntToDoubleFunction.java)   | 100%            | 100%          | 100%            | 100%              |
| [FailableIntToLongFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntToLongFunction.java)       | 100%            | 100%          | 100%            | 100%              |
| [FailableIntUnaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntUnaryOperator.java)         | 100%            | 100%          | 100%            | 100%              |
| [FailableLongConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongConsumer.java)                 | 100%            | 100%          | 100%            | 100%              |
| [FailableLongFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongFunction.java)                 | 100%            | 100%          | 100%            | 100%              |
| [FailableLongPredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongPredicate.java)               | 100%            | 100%          | 100%            | 100%              |
| [FailableLongToDoubleFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongToDoubleFunction.java) | 100%            | 100%          | 100%            | 100%              |
| [FailableLongToIntFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongToIntFunction.java)       | 100%            | 100%          | 100%            | 100%              |
| [FailableLongUnaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongUnaryOperator.java)       | 100%            | 100%          | 100%            | 57%               |
| [FailableObjDoubleConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableObjDoubleConsumer.java)       | 100%            | 100%          | 100%            | 100%              |
| [FailableObjIntConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableObjIntConsumer.java)             | 100%            | 100%          | 100%            | 100%              |
| [FailableObjLongConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableObjLongConsumer.java)           | 100%            | 100%          | 100%            | 100%              |
| [FailablePredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailablePredicate.java)                       | 100%            | 100%          | 100%            | 100%              |
| [FailableToDoubleBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToDoubleBiFunction.java)     | 100%            | 100%          | 100%            | 100%              |
| [FailableToDoubleFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToDoubleFunction.java)         | 100%            | 100%          | 100%            | 100%              |
| [FailableToIntBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToIntBiFunction.java)           | 100%            | 100%          | 100%            | 100%              |
| [FailableToIntFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToIntFunction.java)               | 100%            | 100%          | 100%            | 100%              |
| [FailableToLongBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToLongBiFunction.java)         | 100%            | 100%          | 100%            | 100%              |
| [FailableToLongFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToLongFunction.java)             | 100%            | 100%          | 100%            | 100%              |
| [MethodInvokers.java](/completeproject/src/main/java/org/apache/commons/lang3/function/MethodInvokers.java)                             | 100%            | 85%           | 100%            | 100%              |
| [Suppliers.java](/completeproject/src/main/java/org/apache/commons/lang3/function/Suppliers.java)                                       | 100%            | 100%          | 100%            | 100%              |
| [TriConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/TriConsumer.java)                                   | 100%            | 100%          | 100%            | 67%               |
| [TriFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/TriFunction.java)                                   | 100%            | 100%          | 100%            | 100%              |


### [org.apache.commons.lang3.stream](/completeproject/src/main/java/org/apache/commons/lang3/stream/) - Will Daknis
| File                                                                                                             | Method Coverage | Line Coverage | Branch Coverage | Mutation Coverage |
|------------------------------------------------------------------------------------------------------------------|-----------------|---------------|-----------------|-------------------|
| [IntStreams.java](/completeproject/src/main/java/org/apache/commons/lang3/stream/IntStreams.java)   | 100% (2/2)       | 100% (2/2)   | 100% (0/0)      | 100% (2/2)       |
| [Streams.java](/completeproject/src/main/java/org/apache/commons/lang3/stream/Streams.java)   | 80% (25/31)       | 73% (33/45)   | 66% (2/3)      | 54% (22/41)       |

### [org.apache.commons.lang3.compare](/completeproject/src/main/java/org/apache/commons/lang3/compare/) - Will Daknis
| File                                                                                                             | Method Coverage | Line Coverage | Branch Coverage | Mutation Coverage |
|------------------------------------------------------------------------------------------------------------------|-----------------|---------------|-----------------|-------------------|
| [ComparableUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/compare/ComparableUtils.java)   | 90% (18/20)       | 90% (19/21)   | 100% (15/15)      | 69% (35/51)       |
| [ObjectToStringComparator.java](/completeproject/src/main/java/org/apache/commons/lang3/compare/ObjectToStringComparator.java)   | 100% (2/2)       | 100% (17/17)   | 100% (8/8)      | 69% (9/13)       |

### [org.apache.commons.lang3.event](/completeproject/src/main/java/org/apache/commons/lang3/event/) - Will Daknis
| File                                                                                                             | Method Coverage | Line Coverage | Branch Coverage | Mutation Coverage |
|------------------------------------------------------------------------------------------------------------------|-----------------|---------------|-----------------|-------------------|
| [EventListenerSupport.java](/completeproject/src/main/java/org/apache/commons/lang3/event/EventListenerSupport.java)   | 100% (18/18)       | 100% (44/44)   | 75% (3/4)      | 93% (13/14)       |
| [EventUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/event/EventUtils.java)   | 100% (5/5)       | 84% (21/25)   | 100% (4/4)      | 75% (6/8)       |

## Iteration Two Reflection

### What went well
We collaborated to cut down a selection of feasible packages and set criteria for which ones we would accept. 
We were able to arrange and set a weekly meeting time. 
We were all committed to staying on top of the course content and ensuring that everyone was on the same page when it came to the assignment.

### What could have gone better
Time management proved to be a big stumbling issue in this iteration. 
Much of our work was put off until the very last minute. 
This was primarily due to a longer-than-expected discussion of project details, 
and many of us had other course projects to complete during this iteration. 
Now that the details of what we're working on have been hammered out, our method should be more consistent and timely.
