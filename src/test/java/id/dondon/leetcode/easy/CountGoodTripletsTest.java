package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class CountGoodTripletsTest {

  @Test
  public void test() {
    CountGoodTriplets solution = new CountGoodTriplets();

    Assert.assertEquals(4, solution.countGoodTriplets(new int[]{3,0,1,1,9,7}, 7, 2, 3));
    Assert.assertEquals(0, solution.countGoodTriplets(new int[]{1,1,2,2,3}, 0, 0, 1));
  }

}
