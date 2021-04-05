package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ThirdMaximumNumberTest {

  @Test
  public void test() {
    ThirdMaximumNumber solution = new ThirdMaximumNumber();
    Assert.assertEquals(1, solution.thirdMax(new int[]{3, 2, 1}));
    Assert.assertEquals(2, solution.thirdMax(new int[]{2, 1}));
    Assert.assertEquals(1, solution.thirdMax(new int[]{3, 2, 2, 1}));
  }

}
