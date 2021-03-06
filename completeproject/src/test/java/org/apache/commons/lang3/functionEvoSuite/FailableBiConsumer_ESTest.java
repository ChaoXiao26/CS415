/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 07 20:27:50 GMT 2022
 */

package org.apache.commons.lang3.functionEvoSuite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.function.FailableBiConsumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FailableBiConsumer_ESTest extends FailableBiConsumer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FailableBiConsumer<Integer, Object, Throwable> failableBiConsumer0 = FailableBiConsumer.nop();
      Integer integer0 = new Integer(0);
      failableBiConsumer0.accept(integer0, integer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FailableBiConsumer<Object, String, Throwable> failableBiConsumer0 = FailableBiConsumer.nop();
      // Undeclared exception!
      try { 
        failableBiConsumer0.andThen((FailableBiConsumer<? super Object, ? super String, Throwable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FailableBiConsumer<Object, Object, Throwable> failableBiConsumer0 = FailableBiConsumer.nop();
      FailableBiConsumer<Object, Object, Throwable> failableBiConsumer1 = failableBiConsumer0.andThen(failableBiConsumer0);
      FailableBiConsumer<Object, Object, Throwable> failableBiConsumer2 = failableBiConsumer0.andThen(failableBiConsumer1);
      assertFalse(failableBiConsumer2.equals((Object)failableBiConsumer0));
  }
}
