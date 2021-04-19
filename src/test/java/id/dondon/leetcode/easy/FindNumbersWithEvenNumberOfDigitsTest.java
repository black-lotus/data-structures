package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class FindNumbersWithEvenNumberOfDigitsTest {

  @Test
  public void test() {
    FindNumbersWithEvenNumberOfDigits solution = new FindNumbersWithEvenNumberOfDigits();

    Assert.assertEquals(2, solution.findNumbers(new int[]{12,345,2,6,7896}));
    Assert.assertEquals(1, solution.findNumbers(new int[]{555,901,482,1771}));
  }

}