/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 21:08:45 GMT 2022
 */

package org.apache.commons.lang3.WillEvoSuite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.event.EventUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EventUtils_ESTest extends EventUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EventUtils eventUtils0 = new EventUtils();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        EventUtils.addEventListener((Object) eventUtils0, class0, (Object) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Class org.apache.commons.lang3.event.EventUtils does not have a public addObject method which takes a parameter of type java.lang.Object.
         //
         verifyException("org.apache.commons.lang3.event.EventUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        EventUtils.bindEventsToMethod((Object) null, "", object0, class0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.event.EventUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        EventUtils.addEventListener((Object) null, class0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.reflect.MethodUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EventUtils eventUtils0 = new EventUtils();
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        EventUtils.bindEventsToMethod((Object) " ^ehol which takes a parameter of type ", " ^ehol which takes a parameter of type ", (Object) eventUtils0, class0, stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.lang.Object is not an interface
         //
         verifyException("java.lang.reflect.Proxy$ProxyClassFactory", e);
      }
  }
}
