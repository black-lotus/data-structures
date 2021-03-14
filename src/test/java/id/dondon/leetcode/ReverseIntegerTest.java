package id.dondon.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

  @Test
  public void test() {
    ReverseInteger solution = new ReverseInteger();

    int input1 = 123;
    int expected1 = 321;
    Assert.assertEquals(expected1, solution.reverse(input1));

    int input2 = -123;
    int expected2 = -321;
    Assert.assertEquals(expected2, solution.reverse(input2));

    int input3 = 1534236469;
    int expected3 = 0;
    Assert.assertEquals(expected3, solution.reverse(input3));
  }

}
