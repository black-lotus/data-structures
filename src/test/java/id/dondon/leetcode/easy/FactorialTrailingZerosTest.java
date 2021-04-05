package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTrailingZerosTest {

  @Test
  public void test() {
    FactorialTrailingZeros solution = new FactorialTrailingZeros();

    Assert.assertEquals(0, solution.trailingZeroes(3));
    Assert.assertEquals(1, solution.trailingZeroes(5));
    Assert.assertEquals(49, solution.trailingZeroes(200));
  }

}
