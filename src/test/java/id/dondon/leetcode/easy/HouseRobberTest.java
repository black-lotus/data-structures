package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobberTest {

  @Test
  public void test() {
    HouseRobber solution = new HouseRobber();

    Assert.assertEquals(4, solution.rob(new int[]{1,2,3,1}));
    Assert.assertEquals(12, solution.rob(new int[]{2,7,9,3,1}));
  }

}
