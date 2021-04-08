package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class RunningSumOf1dArrayTest {

  @Test
  public void test() {
    RunningSumOf1dArray solution = new RunningSumOf1dArray();
    Assert.assertArrayEquals(new int[]{1,3,6,10}, solution.runningSum(new int[]{1,2,3,4}));
    Assert.assertArrayEquals(new int[]{1,2,3,4,5}, solution.runningSum(new int[]{1,1,1,1,1}));
  }

}
