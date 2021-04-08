package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductOfThreeNumbersTest {

  @Test
  public void test() {
    MaximumProductOfThreeNumbers solution = new MaximumProductOfThreeNumbers();

    Assert.assertEquals(6, solution.maximumProduct(new int[]{1, 2, 3}));
    Assert.assertEquals(24, solution.maximumProduct(new int[]{1, 2, 3, 4}));
    Assert.assertEquals(-6, solution.maximumProduct(new int[]{-1, -2, -3}));
    Assert.assertEquals(300, solution.maximumProduct(new int[]{-100, -2, -3, 1}));
  }

}
