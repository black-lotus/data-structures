package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuySellStockTest {

  @Test
  public void test() {
    BestTimeToBuySellStock solution = new BestTimeToBuySellStock();

    Assert.assertEquals(5, solution.maxProfit(new int[]{7,1,5,3,6,4}));
    Assert.assertEquals(0, solution.maxProfit(new int[]{7,6,4,3,1}));
    Assert.assertEquals(2, solution.maxProfit(new int[]{2,4,1}));
  }

}
