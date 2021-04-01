package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfThreeTest {

  @Test
  public void test() {
    PowerOfThree solution = new PowerOfThree();

    Assert.assertTrue(solution.isPowerOfThree(27));
    Assert.assertTrue(solution.isPowerOfThree(9));
    Assert.assertFalse(solution.isPowerOfThree(0));
    Assert.assertFalse(solution.isPowerOfThree(45));
  }

}
