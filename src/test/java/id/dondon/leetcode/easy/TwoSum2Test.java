package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum2Test {

  @Test
  public void test() {
    TwoSum2 solution = new TwoSum2();

    Assert.assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{2,7,11,15}, 9));
    Assert.assertArrayEquals(new int[]{1, 3}, solution.twoSum(new int[]{2,3,4}, 6));
    Assert.assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{-1,0}, -1));
  }

}
