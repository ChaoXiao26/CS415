/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 21:15:18 GMT 2022
 */

package org.apache.commons.lang3.WillEvoSuite;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.stream.IntStream;
import org.apache.commons.lang3.stream.IntStreams;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IntStreams_ESTest extends IntStreams_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntStream intStream0 = IntStreams.range((-3364));
      assertNotNull(intStream0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IntStream intStream0 = IntStreams.rangeClosed((-3364));
      assertNotNull(intStream0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IntStreams intStreams0 = new IntStreams();
  }
}
