/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 14 14:40:06 GMT 2016
 */

package careercupbook;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import careercupbook.FindContinuousSequenceWithLargestSum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FindContinuousSequenceWithLargestSum_ESTest extends FindContinuousSequenceWithLargestSum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        FindContinuousSequenceWithLargestSum.findContinuousSequenceWithLargestSum((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("careercupbook.FindContinuousSequenceWithLargestSum", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 6;
      int int0 = FindContinuousSequenceWithLargestSum.findContinuousSequenceWithLargestSum(intArray0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-3755);
      int int0 = FindContinuousSequenceWithLargestSum.findContinuousSequenceWithLargestSum(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = FindContinuousSequenceWithLargestSum.findContinuousSequenceWithLargestSum(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FindContinuousSequenceWithLargestSum findContinuousSequenceWithLargestSum0 = new FindContinuousSequenceWithLargestSum();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FindContinuousSequenceWithLargestSum.main((String[]) null);
  }
}