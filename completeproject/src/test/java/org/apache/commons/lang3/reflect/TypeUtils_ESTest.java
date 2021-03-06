/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 14 17:31:01 GMT 2022
 */

package org.apache.commons.lang3.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class TypeUtils_ESTest extends TypeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Type[] typeArray0 = new Type[5];
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      typeArray0[0] = (Type) wildcardType0;
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      WildcardType wildcardType1 = typeUtils_WildcardTypeBuilder0.build();
      typeArray0[1] = (Type) wildcardType1;
      GenericArrayType genericArrayType0 = TypeUtils.genericArrayType(wildcardType0);
      assertTrue(wildcardType0.equals((Object)wildcardType1));
      
      typeArray0[4] = (Type) genericArrayType0;
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = (Type) wildcardType0;
      typeArray0[1] = (Type) wildcardType0;
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      GenericArrayType genericArrayType0 = TypeUtils.genericArrayType(class0);
      Class<?> class1 = TypeUtils.getRawType(genericArrayType0, genericArrayType0);
      assertFalse(class1.isEnum());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<String> class0 = String.class;
      Type[] typeArray0 = new Type[0];
      ParameterizedType parameterizedType0 = TypeUtils.parameterize(class0, typeArray0);
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      Type[] typeArray1 = new Type[8];
      typeArray1[0] = (Type) parameterizedType0;
      typeArray1[1] = (Type) parameterizedType0;
      typeArray1[2] = (Type) class0;
      typeArray1[3] = (Type) parameterizedType0;
      typeArray1[4] = (Type) parameterizedType0;
      typeArray1[5] = (Type) parameterizedType0;
      typeArray1[6] = (Type) parameterizedType0;
      typeArray1[7] = (Type) parameterizedType0;
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder1 = typeUtils_WildcardTypeBuilder0.withUpperBounds(typeArray1);
      WildcardType wildcardType0 = typeUtils_WildcardTypeBuilder1.build();
      Type[] typeArray2 = TypeUtils.getImplicitUpperBounds(wildcardType0);
      assertEquals(0, typeArray2.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.typesSatisfyVariables((Map<TypeVariable<?>, Type>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // typeVariableMap
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.toString((Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The validated object is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type[] typeArray0 = new Type[1];
      // Undeclared exception!
      try { 
        TypeUtils.parameterizeWithOwner((Type) null, (Class<?>) null, typeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rawClass
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      Class<Object> class0 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) wildcardType0, (Class<?>) class0);
      Class<String> class1 = String.class;
      ParameterizedType parameterizedType0 = TypeUtils.parameterize(class1, map0);
      // Undeclared exception!
      try { 
        TypeUtils.parameterizeWithOwner((Type) parameterizedType0, (Class<?>) null, map0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rawClass
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      Class<Object> class0 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) wildcardType0, (Class<?>) class0);
      GenericArrayType genericArrayType0 = TypeUtils.genericArrayType(wildcardType0);
      Class<String> class1 = String.class;
      // Undeclared exception!
      try { 
        TypeUtils.parameterizeWithOwner((Type) genericArrayType0, (Class<?>) class1, map0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no owner allowed for top-level class java.lang.String
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        TypeUtils.parameterize(class0, (Type[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The validated object is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        TypeUtils.parameterize(class0, (Map<TypeVariable<?>, Type>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // typeVariableMap
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.normalizeUpperBounds((Type[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // bounds
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        TypeUtils.getTypeArguments((Type) null, class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // found an unhandled type: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.getTypeArguments((ParameterizedType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.getImplicitUpperBounds((WildcardType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // wildcardType
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.getImplicitLowerBounds((WildcardType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // wildcardType
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.genericArrayType((Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // componentType
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        TypeUtils.determineTypeArguments(class0, (ParameterizedType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // superParameterizedType
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      String string0 = TypeUtils.toString((Type) class0);
      assertEquals("java.lang.Integer", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      Type[] typeArray0 = TypeUtils.getImplicitUpperBounds(wildcardType0);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        TypeUtils.parameterizeWithOwner((Type) null, class0, typeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid number of type parameters specified: expected 0, got 1
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Type[] typeArray0 = new Type[0];
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertSame(typeArray1, typeArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TypeUtils typeUtils0 = new TypeUtils();
      Class<?> class0 = TypeUtils.getRawType(typeUtils0.WILDCARD_ALL, typeUtils0.WILDCARD_ALL);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      WildcardType wildcardType0 = typeUtils_WildcardTypeBuilder0.build();
      Type[] typeArray0 = TypeUtils.getImplicitUpperBounds(wildcardType0);
      assertEquals(1, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      Type[] typeArray0 = new Type[6];
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder1 = typeUtils_WildcardTypeBuilder0.withLowerBounds(typeArray0);
      WildcardType wildcardType0 = typeUtils_WildcardTypeBuilder1.build();
      Type[] typeArray1 = TypeUtils.getImplicitLowerBounds(wildcardType0);
      assertEquals(6, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type[] typeArray0 = new Type[0];
      ParameterizedType parameterizedType0 = TypeUtils.parameterizeWithOwner((Type) null, class0, typeArray0);
      boolean boolean0 = TypeUtils.equals((Type) class0, (Type) parameterizedType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Type[] typeArray0 = new Type[0];
      ParameterizedType parameterizedType0 = TypeUtils.parameterize(class0, typeArray0);
      boolean boolean0 = TypeUtils.equals((Type) parameterizedType0, (Type) parameterizedType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = TypeUtils.containsTypeVariables((Type) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = TypeUtils.containsTypeVariables(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      String string0 = TypeUtils.toString((Type) wildcardType0);
      assertEquals("?", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      WildcardType wildcardType0 = typeUtils_WildcardTypeBuilder0.build();
      GenericArrayType genericArrayType0 = TypeUtils.genericArrayType(wildcardType0);
      Type type0 = TypeUtils.unrollVariables((Map<TypeVariable<?>, Type>) null, genericArrayType0);
      assertNotNull(type0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TypeUtils typeUtils0 = new TypeUtils();
      Class<Object> class0 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) typeUtils0.WILDCARD_ALL, (Class<?>) class0);
      Type type0 = TypeUtils.unrollVariables(map0, (Type) null);
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Type[] typeArray0 = new Type[0];
      Class<Integer> class0 = Integer.class;
      ParameterizedType parameterizedType0 = TypeUtils.parameterize(class0, typeArray0);
      Map<TypeVariable<?>, Type> map0 = TypeUtils.determineTypeArguments(class0, parameterizedType0);
      assertNotNull(map0);
      
      boolean boolean0 = TypeUtils.typesSatisfyVariables(map0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      WildcardType wildcardType0 = typeUtils_WildcardTypeBuilder0.build();
      String string0 = TypeUtils.toString((Type) wildcardType0);
      assertEquals("?", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      Class<Integer> class0 = Integer.class;
      Class<?> class1 = TypeUtils.getRawType(class0, class0);
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = (Type) class1;
      typeArray0[1] = (Type) wildcardType0;
      typeArray0[2] = (Type) class0;
      typeArray0[3] = (Type) wildcardType0;
      typeArray0[4] = (Type) class0;
      typeArray0[5] = (Type) class1;
      typeArray0[6] = (Type) class1;
      typeArray0[7] = (Type) wildcardType0;
      // Undeclared exception!
      try { 
        TypeUtils.parameterize(class0, typeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid number of type parameters specified: expected 0, got 8
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      WildcardType wildcardType0 = typeUtils_WildcardTypeBuilder0.build();
      GenericArrayType genericArrayType0 = TypeUtils.genericArrayType(wildcardType0);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        TypeUtils.parameterizeWithOwner((Type) genericArrayType0, (Class<?>) class0, (Type[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no owner allowed for top-level class java.lang.String
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      boolean boolean0 = TypeUtils.isInstance((Object) null, wildcardType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Type[] typeArray0 = new Type[5];
      boolean boolean0 = TypeUtils.isInstance(typeArray0[0], (Type) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      WildcardType wildcardType0 = typeUtils_WildcardTypeBuilder0.build();
      Object object0 = new Object();
      boolean boolean0 = TypeUtils.isInstance(object0, wildcardType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      Type[] typeArray0 = TypeUtils.getImplicitUpperBounds(wildcardType0);
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      typeUtils_WildcardTypeBuilder0.withLowerBounds(typeArray0);
      WildcardType wildcardType1 = typeUtils_WildcardTypeBuilder0.build();
      boolean boolean0 = TypeUtils.isAssignable(wildcardType0, wildcardType1);
      assertFalse(boolean0);
      assertFalse(wildcardType0.equals((Object)wildcardType1));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      WildcardType wildcardType0 = typeUtils_WildcardTypeBuilder0.build();
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = (Type) wildcardType0;
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TypeUtils typeUtils0 = new TypeUtils();
      Class<Object> class0 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) typeUtils0.WILDCARD_ALL, (Class<?>) class0);
      Class<?> class1 = TypeUtils.getRawType(class0, (Type) null);
      ParameterizedType parameterizedType0 = TypeUtils.parameterizeWithOwner((Type) null, class1, map0);
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      Class<Integer> class2 = Integer.class;
      Type[] typeArray0 = new Type[4];
      typeArray0[1] = (Type) typeUtils0.WILDCARD_ALL;
      typeArray0[2] = (Type) parameterizedType0;
      typeArray0[0] = (Type) class2;
      typeUtils_WildcardTypeBuilder0.withUpperBounds(typeArray0);
      WildcardType wildcardType0 = typeUtils_WildcardTypeBuilder0.build();
      boolean boolean0 = TypeUtils.containsTypeVariables(wildcardType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = TypeUtils.isArrayType(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = TypeUtils.isArrayType((Type) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      GenericArrayType genericArrayType0 = TypeUtils.genericArrayType(class0);
      boolean boolean0 = TypeUtils.isArrayType(genericArrayType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      GenericArrayType genericArrayType0 = TypeUtils.genericArrayType(wildcardType0);
      Class<Integer> class0 = Integer.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) genericArrayType0, (Class<?>) class0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      Class<Object> class0 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) wildcardType0, (Class<?>) class0);
      ParameterizedType parameterizedType0 = TypeUtils.parameterize(class0, map0);
      Map<TypeVariable<?>, Type> map1 = TypeUtils.getTypeArguments((Type) parameterizedType0, (Class<?>) class0);
      assertTrue(map1.equals((Object)map0));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      Class<Object> class0 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) wildcardType0, (Class<?>) class0);
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = (Type) class0;
      Class<String> class1 = String.class;
      ParameterizedType parameterizedType0 = TypeUtils.parameterize(class1, map0);
      typeArray0[4] = (Type) parameterizedType0;
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.getRawType((Type) null, (Type) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      GenericArrayType genericArrayType0 = TypeUtils.genericArrayType(wildcardType0);
      // Undeclared exception!
      try { 
        TypeUtils.getRawType(genericArrayType0, (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TypeUtils typeUtils0 = new TypeUtils();
      Class<Object> class0 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) typeUtils0.WILDCARD_ALL, (Class<?>) class0);
      Class<?> class1 = TypeUtils.getRawType(class0, (Type) null);
      ParameterizedType parameterizedType0 = TypeUtils.parameterizeWithOwner((Type) null, class1, map0);
      Class<?> class2 = TypeUtils.getRawType(parameterizedType0, (Type) null);
      assertEquals(1, class2.getModifiers());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      GenericArrayType genericArrayType0 = TypeUtils.genericArrayType(wildcardType0);
      Type type0 = TypeUtils.getArrayComponentType(genericArrayType0);
      assertNotNull(type0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type type0 = TypeUtils.getArrayComponentType(class0);
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TypeUtils typeUtils0 = new TypeUtils();
      Type type0 = TypeUtils.getArrayComponentType(typeUtils0.WILDCARD_ALL);
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Class<String> class0 = String.class;
      Type[] typeArray0 = new Type[0];
      ParameterizedType parameterizedType0 = TypeUtils.parameterize(class0, typeArray0);
      // Undeclared exception!
      try { 
        TypeUtils.toString((Type) parameterizedType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The validated array is empty
         //
         verifyException("org.apache.commons.lang3.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      Type[] typeArray0 = TypeUtils.getImplicitUpperBounds(wildcardType0);
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      typeUtils_WildcardTypeBuilder0.withLowerBounds(typeArray0);
      WildcardType wildcardType1 = typeUtils_WildcardTypeBuilder0.build();
      boolean boolean0 = TypeUtils.equals((Type) wildcardType1, (Type) wildcardType0);
      assertFalse(boolean0);
      assertFalse(wildcardType0.equals((Object)wildcardType1));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      WildcardType wildcardType0 = typeUtils_WildcardTypeBuilder0.build();
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = TypeUtils.equals((Type) wildcardType0, (Type) class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Type[] typeArray0 = new Type[0];
      ParameterizedType parameterizedType0 = TypeUtils.parameterize(class0, typeArray0);
      Class<Object> class1 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.determineTypeArguments(class1, parameterizedType0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      GenericArrayType genericArrayType0 = TypeUtils.genericArrayType(wildcardType0);
      boolean boolean0 = TypeUtils.containsTypeVariables(genericArrayType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      Class<Object> class0 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) wildcardType0, (Class<?>) class0);
      ParameterizedType parameterizedType0 = TypeUtils.parameterize(class0, map0);
      boolean boolean0 = TypeUtils.containsTypeVariables(parameterizedType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type[] typeArray0 = new Type[0];
      ParameterizedType parameterizedType0 = TypeUtils.parameterize(class0, typeArray0);
      Class<Integer> class1 = Integer.class;
      ParameterizedType parameterizedType1 = TypeUtils.parameterize(class1, typeArray0);
      boolean boolean0 = TypeUtils.equals((Type) parameterizedType0, (Type) parameterizedType1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type[] typeArray0 = new Type[0];
      ParameterizedType parameterizedType0 = TypeUtils.parameterizeWithOwner((Type) null, class0, typeArray0);
      boolean boolean0 = TypeUtils.isAssignable(parameterizedType0, parameterizedType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      GenericArrayType genericArrayType0 = TypeUtils.genericArrayType(wildcardType0);
      boolean boolean0 = TypeUtils.isAssignable(genericArrayType0, genericArrayType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      TypeUtils typeUtils0 = new TypeUtils();
      Type[] typeArray0 = TypeUtils.getImplicitLowerBounds(typeUtils0.WILDCARD_ALL);
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      typeUtils_WildcardTypeBuilder0.withLowerBounds(typeArray0);
      assertEquals(1, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      TypeUtils typeUtils0 = new TypeUtils();
      Class<Object> class0 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) typeUtils0.WILDCARD_ALL, (Class<?>) class0);
      Type[] typeArray0 = TypeUtils.getImplicitLowerBounds(typeUtils0.WILDCARD_ALL);
      Class<?> class1 = TypeUtils.getRawType(class0, (Type) null);
      ParameterizedType parameterizedType0 = TypeUtils.parameterize(class1, map0);
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder1 = typeUtils_WildcardTypeBuilder0.withUpperBounds(typeArray0);
      WildcardType wildcardType0 = typeUtils_WildcardTypeBuilder1.build();
      Class<Integer> class2 = Integer.class;
      Type[] typeArray1 = new Type[4];
      typeArray1[0] = (Type) wildcardType0;
      typeArray1[1] = (Type) typeUtils0.WILDCARD_ALL;
      typeArray1[2] = (Type) parameterizedType0;
      typeArray1[3] = (Type) class2;
      typeUtils_WildcardTypeBuilder1.withUpperBounds(typeArray1);
      WildcardType wildcardType1 = typeUtils_WildcardTypeBuilder0.build();
      // Undeclared exception!
      try { 
        TypeUtils.containsTypeVariables(wildcardType1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // found an unhandled type: null
         //
         verifyException("org.apache.commons.lang3.reflect.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      TypeUtils typeUtils0 = new TypeUtils();
      Class<Object> class0 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) typeUtils0.WILDCARD_ALL, (Class<?>) class0);
      assertNotNull(map0);
      
      Class<?> class1 = TypeUtils.getRawType(class0, (Type) null);
      assertNotNull(class1);
      
      ParameterizedType parameterizedType0 = TypeUtils.parameterize(class1, map0);
      boolean boolean0 = TypeUtils.equals((Type) parameterizedType0, (Type) typeUtils0.WILDCARD_ALL);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Typed<Object> typed0 = TypeUtils.wrap(class0);
      assertNotNull(typed0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      TypeUtils.WildcardTypeBuilder typeUtils_WildcardTypeBuilder0 = TypeUtils.wildcardType();
      WildcardType wildcardType0 = typeUtils_WildcardTypeBuilder0.build();
      GenericArrayType genericArrayType0 = TypeUtils.genericArrayType(wildcardType0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = (Type) wildcardType0;
      typeArray0[1] = (Type) wildcardType0;
      typeArray0[2] = (Type) genericArrayType0;
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Class<Object> class0 = Object.class;
      GenericArrayType genericArrayType0 = TypeUtils.genericArrayType(class0);
      String string0 = TypeUtils.toString((Type) genericArrayType0);
      assertEquals("java.lang.Object[]", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      WildcardType wildcardType0 = TypeUtils.WILDCARD_ALL;
      Typed<Object> typed0 = TypeUtils.wrap((Type) wildcardType0);
      assertNotNull(typed0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Class<String> class0 = String.class;
      Type[] typeArray0 = new Type[0];
      ParameterizedType parameterizedType0 = TypeUtils.parameterize(class0, typeArray0);
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments(parameterizedType0);
      assertEquals(0, map0.size());
  }
}
