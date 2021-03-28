package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuySellStock2Test {

  @Test
  public void test() {
    BestTimeToBuySellStock2 solution = new BestTimeToBuySellStock2();

    int[] input1 = new int[]{7,1,5,3,6,4};
    int expected1 = 7;
    int result1 = solution.maxProfit(input1);
    Assert.assertEquals(expected1, result1);

    int[] input2 = new int[]{1,2,3,4,5};
    int expected2 = 4;
    int result2 = solution.maxProfit(input2);
    Assert.assertEquals(expected2, result2);

    int[] input3 = new int[]{7,6,4,3,1};
    int expected3 = 0;
    int result3 = solution.maxProfit(input3);
    Assert.assertEquals(expected3, result3);
  }

}
