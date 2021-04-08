package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class RichestCustomerWealthTest {

  @Test
  public void test() {
    RichestCustomerWealth solution = new RichestCustomerWealth();
    Assert.assertEquals(6, solution.maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
    Assert.assertEquals(10, solution.maximumWealth(new int[][]{{1,5},{7,3},{3,5}}));
  }

}
