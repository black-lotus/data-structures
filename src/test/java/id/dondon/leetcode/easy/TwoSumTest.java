package id.dondon.leetcode.easy;

import id.dondon.leetcode.easy.TwoSum;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

  @Test
  public void test() {
    int[] input = new int[]{2, 7, 11, 15};
    int target = 9;

    TwoSum solution = new TwoSum();
    int[] result = solution.twoSum(input, target);
    int[] expected = new int[]{0, 1};

    Assert.assertArrayEquals(expected, result);
  }

}
