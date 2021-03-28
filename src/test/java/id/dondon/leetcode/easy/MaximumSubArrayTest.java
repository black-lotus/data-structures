package id.dondon.leetcode.easy;

import id.dondon.leetcode.easy.MaximumSubArray;
import org.junit.Assert;
import org.junit.Test;

public class MaximumSubArrayTest {

  @Test
  public void test() {
    MaximumSubArray solution = new MaximumSubArray();

    int[] input1 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
    int result1 = solution.maxSubArray(input1);
    int expected1 = 6;
    Assert.assertEquals(expected1, result1);

    int[] input2 = new int[]{1};
    int result2 = solution.maxSubArray(input2);
    int expected2 = 1;
    Assert.assertEquals(expected2, result2);

    int[] input3 = new int[]{5,4,-1,7,8};
    int result3 = solution.maxSubArray(input3);
    int expected3 = 23;
    Assert.assertEquals(expected3, result3);
  }

}
