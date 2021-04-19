package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductOfTwoElementsInAnArrayTest {

  @Test
  public void test() {
    MaximumProductOfTwoElementsInAnArray solution = new MaximumProductOfTwoElementsInAnArray();

    Assert.assertEquals(12, solution.maxProduct(new int[]{3,4,5,2}));
    Assert.assertEquals(16, solution.maxProduct(new int[]{1,5,4,5}));
    Assert.assertEquals(12, solution.maxProduct(new int[]{3,7}));
  }

}