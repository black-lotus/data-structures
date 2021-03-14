package id.dondon.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

  @Test
  public void test() {
    RomanToInteger solution = new RomanToInteger();

    String input1 = "III";
    int expected1 = 3;
    Assert.assertEquals(expected1, solution.romanToInt(input1));

    String input2 = "IV";
    int expected2 = 4;
    Assert.assertEquals(expected2, solution.romanToInt(input2));

    String input3 = "CCCXL";
    int expected3 = 340;
    Assert.assertEquals(expected3, solution.romanToInt(input3));

  }

}
