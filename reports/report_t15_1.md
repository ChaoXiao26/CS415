# Team 15: Iteration One Report

### Selected Project: [commons-lang](/completeproject)

Our team selected the commons-lang project to analyze and improve testing on. The following tables include information regarding the current overall test coverage for the selected packages and the characteristics of their corresponding files. The data provided is from the initial unit tests for the project and will be used as a baseline for us to improve upon. 

## Project Coverage & Characteristics:
| Package                                                                                                | Class Coverage | Method Coverage | Line Coverage | Branch Coverage |
|--------------------------------------------------------------------------------------------------------|----------------|-----------------|---------------|-----------------|
| [org.apache.commons.lang3.reflect](/completeproject/src/main/java/org/apache/commons/lang3/reflect/)   | 100%           | 92%             | 84%           | 64%             | 
| [org.apache.commons.lang3.function](/completeproject/src/main/java/org/apache/commons/lang3/function/) | 53%            | 76%             | 80%           | 90%             | 
| [org.apache.commons.lang3.text](/completeproject/src/main/java/org/apache/commons/lang3/text/)         | 100%           | 95%             | 94%           | 100%            | 
| [org.apache.commons.lang3.compare](/completeproject/src/main/java/org/apache/commons/lang3/compare/)   | 100%           | 72%             | 84%           | 100%            |
| [org.apache.commons.lang3.event](/completeproject/src/main/java/org/apache/commons/lang3/event/)       | 100%           | 100%            | 94%           | 100%            |
| [org.apache.commons.lang3.stream](/completeproject/src/main/java/org/apache/commons/lang3/stream/)     | 100%           | 81%             | 74%           | 66%             |


| Package                                                                                                | Number of Classes | Number of Methods | Number of Statements |
|--------------------------------------------------------------------------------------------------------|-------------------|-------------------|----------------------|
| [org.apache.commons.lang3.reflect](/completeproject/src/main/java/org/apache/commons/lang3/reflect/)   | 12                | 191               | 1094                 |
| [org.apache.commons.lang3.function](/completeproject/src/main/java/org/apache/commons/lang3/function/) | 39                | 166               | 246                  |
| [org.apache.commons.lang3.text](/completeproject/src/main/java/org/apache/commons/lang3/text/)         | 19                | 373               | 1700                 |
| [org.apache.commons.lang3.compare](/completeproject/src/main/java/org/apache/commons/lang3/compare/)   | 3                 | 22                | 38                   |
| [org.apache.commons.lang3.event](/completeproject/src/main/java/org/apache/commons/lang3/event/)       | 4                 | 23                | 69                   |
| [org.apache.commons.lang3.stream](/completeproject/src/main/java/org/apache/commons/lang3/stream/)     | 4                 | 33                | 47                   |

                                    
## Package Coverage & Characteristics:

### [org.apache.commons.lang3.reflect](/completeproject/src/main/java/org/apache/commons/lang3/reflect/) - Chad Minning
[Minning report files](/reports/Minning_report_files/)

| File                                                                                                             | Method Coverage | Line Coverage | Branch Coverage |
|------------------------------------------------------------------------------------------------------------------|-----------------|---------------|-----------------|
| [ConstructorUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java)   | 88%             | 94%           | 75%             | 
| [FieldUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/FieldUtils.java)               | 97%             | 98%           | 76%             | 
| [IheritanceUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/InheritanceUtils.java)    | 100%            | 100%          | 100%            | 
| [MemberUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/MemberUtils.java)             | 100%            | 93%           | 72%             | 
| [MethodUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java)             | 100%            | 95%           | 78%             | 
| [TypeLiteral.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/TypeLiteral.java)             | 66%             | 73%           | 0%              | 
| [TypeUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java)                 | 87%             | 74%           | 55%             | 


| File | Number of Classes | Number of Methods | Number of Statements | 
|------|-------------------|-------------------|----------------------|
| [ConstructorUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java) | 1 | 9 | 51 | 
| [FieldUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/FieldUtils.java) | 1 | 35 | 129 | 
| [IheritanceUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/InheritanceUtils.java) | 1 | 2 | 11 |
| [MemberUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/MemberUtils.java) | 2 | 22 | 93 |
| [MethodUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java) | 1 | 32 | 247 |
| [TypeLiteral.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/TypeLiteral.java) | 1 | 6 | 15 |
| [TypeUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java) | 5 | 85 | 548 |

### [org.apache.commons.lang3.function](/completeproject/src/main/java/org/apache/commons/lang3/function/) - Yuxin Huang
[Huang report files](/reports/Huang_report_files/)
| File                                                                                                                                    | Method Coverage | Line Coverage | Branch Coverage |
|-----------------------------------------------------------------------------------------------------------------------------------------|-----------------|---------------|-----------------|
| [BooleanConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/BooleanConsumer.java)                           | 100%            | 100%          | 100%            | 
| [Failable.java](/completeproject/src/main/java/org/apache/commons/lang3/function/Failable.java)                                         | 93%             | 90%           | 66%             |
| [FailableBiConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableBiConsumer.java)                     | 100%            | 100%          | 100%            |
| [FailableBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableFunction.java)                       | 100%            | 100%          | 100%            |
| [FailableBiPredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableBiPredicate.java)                   | 100%            | 100%          | 100%            |
| [FailableBooleanSupplier.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableBooleanSupplier.java)           | 100%            | 100%          | 100%            |
| [FailableCallable.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableCallable.java)                         | 100%            | 100%          | 100%            |
| [FailableConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableConsumer.java)                         | 100%            | 100%          | 100%            |
| [FailableDoubleBinaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleBinaryOperator.java) | 100%            | 100%          | 100%            |
| [FailableDoubleConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/functionFailableDoubleConsumer.java)              | 100%            | 100%          | 100%            |
| [FailableDoubleFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleFunction.java)             | 0%              | 0%            | 100%            |
| [FailableDoublePredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoublePredicate.java)           | 100%            | 100%          | 100%            |
| [FailableDoubleSupplier.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleSupplier.java)             | 100%            | 100%          | 100%            |
| [FailableDoubleToIntFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleToIntFunction.java)   | 0%              | 0%            | 100%            |
| [FailableDoubleToLongFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleToLongFunction.java) | 0%              | 0%            | 100%            |
| [FailableDoubleUnaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleUnaryOperator.java)   | 80%             | 85%           | 100%            |
| [FailableFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableFunction.java)                         | 80%             | 85%           | 100%            |
| [FailableIntBinaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntBinaryOperator.java)       | 100%            | 100%          | 100%            |
| [FailableIntConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntConsumer.java)                   | 100%            | 100%          | 100%            |
| [FailableIntFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntFunction.java)                   | 0%              | 0%            | 100%            |
| [FailableIntPredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntPredicate.java)                 | 100%            | 100%          | 100%            |
| [FailableIntSupplier.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntSupplier.java)                   | 100%            | 100%          | 100%            |
| [FailableIntToDoubleFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntToDoubleFunction.java)   | 0%              | 0%            | 100%            |
| [FailableIntToLongFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntToLongFunction.java)       | 0%              | 0%            | 100%            |
| [FailableIntUnaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntUnaryOperator.java)         | 80%             | 85%           | 100%            |
| [FailableLongBinaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongBinaryOperator.java)     | 100%            | 100%          | 100%            |
| [FailableLongConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongConsumer.java)                 | 100%            | 100%          | 100%            |
| [FailableLongFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongFunction.java)                 | 0%              | 0%            | 100%            |
| [FailableLongPredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongPredicate.java)               | 100%            | 100%          | 100%            |
| [FailableLongSupplier.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongSupplier.java)                 | 100%            | 100%          | 100%            |
| [FailableLongToDoubleFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongToDoubleFunction.java) | 0%              | 0%            | 100%            |
| [FailableLongToIntFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongToIntFunction.java)       | 0%              | 0%            | 100%            |
| [FailableLongUnaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongUnaryOperator.java)       | 80%             | 85%           | 100%            |
| [FailableObjDoubleConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableObjDoubleConsumer.java)       | 0%              | 0%            | 100%            |
| [FailableObjIntConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableObjIntConsumer.java)             | 0%              | 0%            | 100%            |
| [FailableObjLongConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableObjLongConsumer.java)           | 0%              | 0%            | 100%            |
| [FailablePredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailablePredicate.java)                       | 85%             | 77%           | 100%            |
| [FailableRunnable.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableRunnable.java)                         | 100%            | 100%          | 100%            |
| [FailableShortSupplier.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableShortSupplier.java)               | 100%            | 100%          | 100%            |
| [FailableSupplier.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableSupplier.java)                         | 100%            | 100%          | 100%            |
| [FailableToDoubleBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToDoubleBiFunction.java)     | 0%              | 0%            | 100%            |
| [FailableToDoubleFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToDoubleFunction.java)         | 0%              | 0%            | 100%            |
| [FailableToIntBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToIntBiFunction.java)           | 0%              | 0%            | 100%            |
| [FailableToIntFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToIntFunction.java)               | 0%              | 0%            | 100%            |
| [FailableToLongBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToLongBiFunction.java)         | 0%              | 0%            | 100%            |
| [FailableToLongFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToLongFunction.java)             | 0%              | 0%            | 100%            |
| [IntToCharFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/IntToCharFunction.java)                       | 100%            | 100%          | 100%            |
| [MethodInvokers.java](/completeproject/src/main/java/org/apache/commons/lang3/function/MethodInvokers.java)                             | 100%            | 85%           | 100%            |
| [Suppliers.java](/completeproject/src/main/java/org/apache/commons/lang3/function/Suppliers.java)                                       | 100%            | 100%          | 100%            |
| [ToBooleanBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/ToBooleanBiFunction.java)                   | 100%            | 100%          | 100%            |
| [TriConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/TriConsumer.java)                                   | 100%            | 100%          | 100%            |
| [TriFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/TriFunction.java)                                   | 100%            | 100%          | 100%            |


| File                                                                                                                                    | Number of Classes | Number of Methods | Number of Statements | 
|-----------------------------------------------------------------------------------------------------------------------------------------|-------------------|-------------------|----------------------|
| [BooleanConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/BooleanConsumer.java)                           | 1                 | 4                 | 6                    |
| [Failable.java](/completeproject/src/main/java/org/apache/commons/lang3/function/Failable.java)                                         | 1                 | 32                | 76                   |
| [FailableBiConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableBiConsumer.java)                     | 1                 | 4                 | 6                    |
| [FailableBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableFunction.java)                       | 1                 | 3                 | 4                    |
| [FailableBiPredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableBiPredicate.java)                   | 1                 | 77                | 9                    |
| [FailableBooleanSupplier.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableBooleanSupplier.java)           | 0                 | 0                 | 0                    |
| [FailableCallable.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableCallable.java)                         | 0                 | 0                 | 0                    |
| [FailableConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableConsumer.java)                         | 1                 | 4                 | 6                    |
| [FailableDoubleBinaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleBinaryOperator.java) | 0                 | 0                 | 0                    |
| [FailableDoubleConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/functionFailableDoubleConsumer.java)              | 1                 | 4                 | 6                    |
| [FailableDoubleFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleFunction.java)             | 1                 | 2                 | 2                    |
| [FailableDoublePredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoublePredicate.java)           | 1                 | 7                 | 9                    |
| [FailableDoubleSupplier.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleSupplier.java)             | 0                 | 0                 | 0                    |
| [FailableDoubleToIntFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleToIntFunction.java)   | 1                 | 2                 | 2                    |
| [FailableDoubleToLongFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleToLongFunction.java) | 1                 | 2                 | 2                    |
| [FailableDoubleUnaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableDoubleUnaryOperator.java)   | 1                 | 5                 | 7                    |
| [FailableFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableFunction.java)                         | 1                 | 5                 | 7                    |
| [FailableIntBinaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntBinaryOperator.java)       | 0                 | 0                 | 0                    |
| [FailableIntConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntConsumer.java)                   | 1                 | 4                 | 6                    |
| [FailableIntFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntFunction.java)                   | 1                 | 2                 | 2                    |
| [FailableIntPredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntPredicate.java)                 | 1                 | 7                 | 9                    |
| [FailableIntSupplier.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntSupplier.java)                   | 0                 | 0                 | 0                    |
| [FailableIntToDoubleFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntToDoubleFunction.java)   | 1                 | 2                 | 2                    |
| [FailableIntToLongFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntToLongFunction.java)       | 1                 | 2                 | 2                    |
| [FailableIntUnaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableIntUnaryOperator.java)         | 1                 | 5                 | 7                    |
| [FailableLongBinaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongBinaryOperator.java)     | 0                 | 0                 | 0                    |
| [FailableLongConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongConsumer.java)                 | 1                 | 4                 | 6                    |
| [FailableLongFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongFunction.java)                 | 1                 | 2                 | 2                    |
| [FailableLongPredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongPredicate.java)               | 1                 | 7                 | 9                    |
| [FailableLongSupplier.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongSupplier.java)                 | 0                 | 0                 | 0                    |
| [FailableLongToDoubleFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongToDoubleFunction.java) | 1                 | 2                 | 2                    |
| [FailableLongToIntFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongToIntFunction.java)       | 1                 | 2                 | 2                    |
| [FailableLongUnaryOperator.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableLongUnaryOperator.java)       | 1                 | 4                 | 7                    |
| [FailableObjDoubleConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableObjDoubleConsumer.java)       | 1                 | 2                 | 2                    |
| [FailableObjIntConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableObjIntConsumer.java)             | 1                 | 2                 | 2                    |
| [FailableObjLongConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableObjLongConsumer.java)           | 1                 | 2                 | 2                    |
| [FailablePredicate.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailablePredicate.java)                       | 1                 | 7                 | 9                    |
| [FailableRunnable.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableRunnable.java)                         | 0                 | 0                 | 0                    |
| [FailableShortSupplier.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableShortSupplier.java)               | 0                 | 0                 | 0                    |
| [FailableSupplier.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableSupplier.java)                         | 0                 | 0                 | 0                    |
| [FailableToDoubleBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToDoubleBiFunction.java)     | 1                 | 2                 | 2                    |
| [FailableToDoubleFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToDoubleFunction.java)         | 1                 | 2                 | 2                    |
| [FailableToIntBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToIntBiFunction.java)           | 1                 | 2                 | 2                    |
| [FailableToIntFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToIntFunction.java)               | 1                 | 2                 | 2                    |
| [FailableToLongBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToLongBiFunction.java)         | 1                 | 2                 | 2                    |
| [FailableToLongFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/FailableToLongFunction.java)             | 1                 | 2                 | 2                    |
| [IntToCharFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/IntToCharFunction.java)                       | 0                 | 0                 | 0                    |
| [MethodInvokers.java](/completeproject/src/main/java/org/apache/commons/lang3/function/MethodInvokers.java)                             | 1                 | 12                | 14                   |
| [Suppliers.java](/completeproject/src/main/java/org/apache/commons/lang3/function/Suppliers.java)                                       | 1                 | 1                 | 1                    |
| [ToBooleanBiFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/ToBooleanBiFunction.java)                   | 0                 | 0                 | 0                    |
| [TriConsumer.java](/completeproject/src/main/java/org/apache/commons/lang3/function/TriConsumer.java)                                   | 1                 | 2                 | 4                    |
| [TriFunction.java](/completeproject/src/main/java/org/apache/commons/lang3/function/TriFunction.java)                                   | 1                 | 1                 | 2                    |

### [org.apache.commons.lang3.text](/completeproject/src/main/java/org/apache/commons/lang3/text/) - Crispin Haro
[Haro report files](/reports/Haro_report_files/)

| File                                                                                                             | Method Coverage | Line Coverage | Branch Coverage |
|------------------------------------------------------------------------------------------------------------------|-----------------|---------------|-----------------|
| [CompositeFormat.java](/completeproject/src/main/java/org/apache/commons/lang3/text/CompositeFormat.java)              | 100%             | 100%          | 100%              | 
| [ExtendedMessageFormat.java](/completeproject/src/main/java/org/apache/commons/lang3/text/ExtendedMessageFormat.java)  | 100%             | 77.3%         | 83.1%             |
| [FormattableUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/text/FormattableUtils.java)            | 100%             | 66.7%         | 87.5%             | 
| [StrBuilder.java](/completeproject/src/main/java/org/apache/commons/lang3/text/StrBuilder.java)                        | 100%             | 98.2%         | 95.1%             | 
| [StrLookup.java](/completeproject/src/main/java/org/apache/commons/lang3/text/StrLookup.java)                          | 100%             | 100%          | 94.7%             | 
| [StrMatcher.java](/completeproject/src/main/java/org/apache/commons/lang3/text/StrMatcher.java)                        | 100%             | 96.3%         | 98.1%             | 
| [StrSubstitutor.java](/completeproject/src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java)                | 100%             | 100%          | 97.3%             | 
| [StrTokenizer.java](/completeproject/src/main/java/org/apache/commons/lang3/text/StrTokenizer.java)                    | 100%             | 90.8%         | 94.4%             | 
| [WordUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/text/WordUtils.java)                          | 100%             | 100%          | 100%              |




| File | Number of Classes | Number of Methods | Number of Statements | 
|------|-------------------|-------------------|----------------------|
| [CompositeFormat.java](/completeproject/src/main/java/org/apache/commons/lang3/text/CompositeFormat.java)              | 1             | 6          | 8              | 
| [ExtendedMessageFormat.java](/completeproject/src/main/java/org/apache/commons/lang3/text/ExtendedMessageFormat.java)  | 1             | 22         | 177            |
| [FormattableUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/text/FormattableUtils.java)            | 1             | 6          | 16             | 
| [StrBuilder.java](/completeproject/src/main/java/org/apache/commons/lang3/text/StrBuilder.java)                        | 4             | 167        | 799            | 
| [StrLookup.java](/completeproject/src/main/java/org/apache/commons/lang3/text/StrLookup.java)                          | 3             | 4          | 19             | 
| [StrMatcher.java](/completeproject/src/main/java/org/apache/commons/lang3/text/StrMatcher.java)                        | 6             | 27         | 54             | 
| [StrSubstitutor.java](/completeproject/src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java)                | 1             | 56         | 261            | 
| [StrTokenizer.java](/completeproject/src/main/java/org/apache/commons/lang3/text/StrTokenizer.java)                    | 1             | 65         | 232            | 
| [WordUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/text/WordUtils.java)                          | 1             | 15         | 134            |



### [org.apache.commons.lang3.function](/completeproject/src/main/java/org/apache/commons/lang3/function/) - Will Daknis
[Daknis report files](/reports/Daknis_report_files/)


| File                                                                                                             | Method Coverage | Line Coverage | Branch Coverage |
|------------------------------------------------------------------------------------------------------------------|-----------------|---------------|-----------------|
| [ComparableUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/compare/ComparableUtils.java) | 70% | 71% | 100% |
| [ObjectToStringComparator.java](/completeproject/src/main/java/org/apache/commons/lang3/compare/ObjectToStringComparator.java) | 100% | 100% | 100% |
| [EventListenerSupport.java](/completeproject/src/main/java/org/apache/commons/lang3/event/EventListenerSupport.java) | 100% | 100% | 100% |
| [EventUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/event/EventUtils.java) | 100% | 84% | 100% |
| [IntStreams.java](/completeproject/src/main/java/org/apache/commons/lang3/streams/TypeUtils.java) | 100% | 100% | 100% |
| [Streams.java](/completeproject/src/main/java/org/apache/commons/lang3/streams/TypeUtils.java) | 80% | 73% | 66% |


| File | Number of Classes | Number of Methods | Number of Statements | 
|------|-------------------|-------------------|----------------------|
| [ComparableUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/compare/ComparableUtils.java) | 2 | 20 | 21 |
| [ObjectToStringComparator.java](/completeproject/src/main/java/org/apache/commons/lang3/compare/ObjectToStringComparator.java) | 1 | 2 | 17 |
| [EventListenerSupport.java](/completeproject/src/main/java/org/apache/commons/lang3/event/EventListenerSupport.java) | 2 | 18 | 44 |
| [EventUtils.java](/completeproject/src/main/java/org/apache/commons/lang3/event/EventUtils.java) | 2 | 5 | 25 |
| [IntStreams.java](/completeproject/src/main/java/org/apache/commons/lang3/streams/TypeUtils.java) | 1 | 2 | 2 |
| [Streams.java](/completeproject/src/main/java/org/apache/commons/lang3/streams/TypeUtils.java) | 3 | 31 | 45 |

## Iteration One Reflection

### What went well
Our team was able to coordinate and determine a weekly time to meet. We worked together to narrow down a list of viable packages and established a criteria for which ones each of us took. We were all diligent in keeping up with the course material and making sure that everyone was on the same page with the project. Although it took some time to sort out bugs, we eventually managed to get everyone's environments working and projects built in order to meet the iteration deliverable.

### What could have gone better
Time management seemed to be our biggest barrier in this iteration. Much of our work ended up being put off to the last minute. This was primarily due to the deliberation on project details taking longer than expected. Now that the details of what we're working on have been sorted out, our workflow should be more consistent and timely. In addition, team communication was fairly inconsistent and could use improvement moving into the next iteration. This is to be expected as we are still in the forming and norming stages. 
