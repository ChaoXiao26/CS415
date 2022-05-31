# Chad Minning: Iteration Two Report

### Selected Package: [org.apache.commons.lang3.reflect](/completeproject/src/main/java/org/apache/commons/lang3/reflect/)
#### [Reflect Coverage Overview](/reports/Minning_report_files/reflect_overview_2.md)

## Testing Details:

### [ConstructorUtilsTest.java](/completeproject/src/test/java/org/apache/commons/lang3/reflect/ConstructorUtilsTest.java)
| Test Name | Class | Method | Strategy | Descripiton |
|-----------|-------|--------|----------|-------------|
| testDefaultConstructor() | ConstructorUtils | Default Constructor | None | This was a simple one-line test that required no strategy. |
| testNoConstructor() | ConstructorUtils | invokeConstructor() | Graph-Based Coverage | This method already had great coverage but I identified a branch in the coverage report that was not being hit. I created a class that would be the appropriate input to traverse the method in a way that covers the missed branch. |
| testAccessibleConstructor() | ConstructorUtils | getMatchingAccessible<br/>Constructor(final Class<T> cls, final Class<?>... parameterTypes) | Graph-Based Coverage | By analyzing the graph-based coverage of this class, I identified two similar uncovered branches in two methods. I determined that one branch would be impossible to hit due to the need for a null value to be passed as an argument after a null check. The other missed branch is covered by this test which required the use of a public class with an inner class that used a constructor with parameters containing a parent class of one of the requested parameters. This would cause a line in this method to assign ctor to null at the appropriate node and hit the missed branch. |

### [TypeLiteralTest.java](/completeproject/src/test/java/org/apache/commons/lang3/reflect/TypeLiteralTest.java)
| Test Name | Class | Method | Strategy | Descripiton |
|-----------|-------|--------|----------|-------------|
| testSameEquals() | TypeLiteral | equals() | Graph-Based Coverage | I decided not to use input space partitioning here due to the small number of input variables and the simple nature of the method. Instead I used graph-based coverage to asses which of the branches weren't being covered. I found that there were no tests comparing an object to itelf or to an object of the same type so I created a test to cover those missed nodes. |
| testHashCode() | TypeLiteral | hashCode() | Input Space Partitioning | There was no test coverage for this method so I used input space partitioning to create some baseline tests. For this method, only the variable value is relevent and it is set implicitly according to the type argument given to the object.<br/><br/> Variable: Type value<br/> Characteristics: type stored in value <br/> Partitions:<br/>1. Hashcode of same TypeLiteral<br/> 2. Hashcode of two TypeLiterals with the same type argument<br/> 3. Hashcodes of two different types of TypeLiterals<br/>Input: <br/>1. TypeLiteral\<String\><br/>2. TypeLiteral\<String\>, TypeLiteral\<String\><br/>3. TypeLiteral\<String\>, TypeLiteral\<Integer\> |
| testToString() | TypeLiteral | toString() | Input Space Partitioning | Similar to hashCode(), this method is dependent on what toString is implicitly set to based on the type argument. This was difficult to keep narrow so I chose three partitions that I felt best encompassed the toString use case.<br/><br/>Variables: String toString<br/>Characteristics: type argument<br/>Partitions:<br/>1. Standard type<br/>2. Parameterized type<br/>3. Generic type<br/>Input: <br/>1. TypeLiteral\<Integer\><br/>2. TypeLiteral\<List\<String\>\><br/>3. TypeLiteral\<WildcardType\> |

### [TypeUtilsTest.java](/completeproject/src/test/java/org/apache/commons/lang3/reflect/TypeUtilsTest.java)
| Test Name                  | Class                 | Method                                                                              | Strategy                   | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
|----------------------------|-----------------------|-------------------------------------------------------------------------------------|----------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| testIsParameterized()      | TypeUtils             | parameterize(Class\<?\> rawClass, Map\<TypeVariable\<?\>, Type\> typeVariableMap)   | Input Space Partitioning   | This method contained very little prior testing so I determined that input space partitioning would be good for establishing solid baseline coverage. There were a lot of indirect branches in the method that this method calls so I assessed types of characteristics and partitions would be relevant for covering those branches. <br/><br/>Input Variables:<br/> Class\<?\> rawClass<br/>Map\<TypeVariable\<?\>, Type\> typeVariableMap<br/><br/>Variable: rawClass<br/>Characteristic: Is Paramaterized<br/>Partitions: True, False<br/>Input Values:<br/>True - Parameterized Object<br/>False - Non-Parameterized Object                                                                                                                                                                                                                                                                                                                |
| testMissingParameters()    | TypeUtils             | parameterize(Class\<?\> rawClass, Map\<TypeVariable\<?\>, Type\> typeVariableMap)   | Input Space Partitioning   | Continuation of input space partitioning described above. I did not write a test for the True partition since that is already tested above.<br/><br/>Variable: typeVariableMap<br/>Characteristic: Contains correct Type variables<br/>Partitions: True, False<br/>Input Values: <br/>True - Map with correct Type<br/>False - Empty Map                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| testSuperinterfaceBlocks() | TypeUtils             | getTypeArguments(final Type type, final Class\<?\> toClass)                         | Input Space Partitioning   | This method contained almost no testing so I decided that input space partitioning would be a good start. This method was incredibly difficult to understand, let alone test. The partitions for it ended up being fairly simple but effective in getting substantial coverage.<br/><br/>Input Variables: Type type, Class\<?\> toClass<br/><br/>For testing these partitions, the data types I needed access to were complicated to get so I created a helper class called GenericComponentClass that allowed me to use reflection to retrieve these data types for testing.<br/><br/>Variable: type<br/>Characteristic: Superinterface of type<br/>Partitions: <br/>1. Class\<?\> <br/>2. ParameterizedType <br/>3. GenericArrayType <br/>4. WildcardType <br/>5. TypeVariable\<D\> <br/>Input Values: <br/>1. Non-parameterized class <br/>2. Parameterized class <br/>3. Generic array <br/>4. Raw WildcardType <br/>5. Normal TypeVariable |
| testIsValidType()          | TypeUtils             | getTypeArguments(final Type type, final Class\<?\> toClass)                         | Input Space Partitioning   | Continuation of input space partitioning for getTypeArguments. This characteristic helps to reach unreached branches in the method. It was too challenging to find a Type that isn't already covered by this method so I used null for the false partition. <br/><br/> Variable: type <br/> Characteristic: Is valid type <br/> Partitions: True, False <br/> Input Values: <br/> True - Any normal Type value <br/> False - null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| testIsSuperinterface()     | TypeUtils             | getTypeArguments(final Type type, final Class\<?\> toClass)                         | Input Space Partitioning   | Continuation of input space partitioning for getTypeArguments. This characteristic is the only meaningful characteristic I could think of for toClass.<br/><br/>Variable: toClass <br/> Characteristic: Is Superinterface of type <br/> Partitions: True, Flase <br/> Input Values: <br/> True - A class that is implemented by type <br/> False - A class that is not implemented by type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| testWildcardHash()         | WildcardTypeImpl      | hashCode()                                                                          | None                       | There was no strategy used here. hashCode() was just previously untested.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| testParameterizedHash()    | ParameterizedTypeImpl | hashCode()                                                                          | None                       | Again,there was no strategy used here. hashCode() was just previously untested.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| testUnrollVariables()      | TypeUtils             | unrollVariables(<br/>Map<TypeVariable<?>, Type> typeArguments, final Type type)     | Graph-Based Coverage       | I noticed that the method, unrollBounds, had no test coverage but the method was private, so I identified a method that called unrollBounds and was public. The method I discovered was unrollVariables which already had decent line coverage. Since there were several missed branches in this method, I decided to use graph-based coverage to determine which nodes I could hit by tracing execution flow in order to find method inputs to get better branch and line coverage for both methods. <br/><br/> Input Values: <br/> typeArguments = null - this gave coverage for a null check branch that was missed. <br/> type = paramaterized Type with owner - this allowed me to hit a node that is only accessible if the owner of a parameterized type is not null. <br/> type = WildcardType - using a WildcardType with an upper bound allowed me to hit many missed branches.                                                       |

### [FieldUtilsTest.java](/completeproject/src/test/java/org/apache/commons/lang3/reflect/FieldUtilsTest.java)
| Test Name                    | Class      | Method                                 | Strategy | Description                                                                                                                                                                               |
|------------------------------|------------|----------------------------------------|----------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| testRemoveFinalModifierAlt() | FieldUtils | removeFinalModifier(final Field field) | None     | No strategy here, just a copy of a prior test for one line of code.                                                                                                                       |
| testGetAllFieldsAlt()        | FieldUtils | getAllFields(final Class\<?\> cls)     | None     | No strategy here either, just testing one line of code. I did create several classes to test this method but that was more for my own understanding of how this kind of reflection works. |

### [MemberUtilsTest.java](/completeproject/src/test/java/org/apache/commons/lang3/reflect/MemberUtilsTest.java)
| Test Name             | Class         | Method                                                                         | Strategy               | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|-----------------------|---------------|--------------------------------------------------------------------------------|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| testTransformCost()   | MemberUtils   | getObjectTransformationCost(Class\<?\> srcClass, final Class\<?\> destClass)   | Graph-Based Coverage   | This class already had decent coverage, but I noticed multiple branches in multiple methods that weren't being hit. Most of the methods are private so I had to do my testing by calling compareMethodFit, however, my tests primarily focused on getObjectTransformationCost and all of the nested private method calls within it. Since there were mostly just unreached branches in this class, it seemed like a good candidate for the graph-coverage testing that I used that as my strategy. |

### [MethodUtilsTest.java](/completeproject/src/test/java/org/apache/commons/lang3/reflect/MethodUtilsTest.java)
| Test Name                  | Class         | Method                                | Strategy               | Description                                                                                                                                                                                                                                                                                              |
|----------------------------|---------------|---------------------------------------|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
 | testGetAccessibleMethod()  | MethodUtils   | getAccessibleMethod(Method method)    | Graph-Based Coverage   | Here I used branch coverage to determine what kinds of classes I would need to create for input in order to reach a missed branch in one of the private methods that this method calls. Since the method I wanted to get coverage on was private, input space partitioning didn't seem appropriate here. | 