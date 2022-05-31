/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 14 02:07:31 GMT 2022
 */

package org.apache.commons.lang3.functionEvoSuite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.function.Supplier;
import org.apache.commons.lang3.function.Suppliers;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Suppliers_ESTest extends Suppliers_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Supplier<Integer> supplier0 = (Supplier<Integer>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(supplier0).get();
      Integer integer1 = Suppliers.get(supplier0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = Suppliers.get((Supplier<Integer>) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Suppliers suppliers0 = new Suppliers();
  }
}