package id.dondon.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class StringToIntegerTest {

  @Test
  public void test() {
    StringToInteger solution = new StringToInteger();

    Assert.assertEquals(42, solution.myAtoi("42"));
    Assert.assertEquals(-42, solution.myAtoi("   -42"));
    Assert.assertEquals(4193, solution.myAtoi("4193 with words"));
    Assert.assertEquals(0, solution.myAtoi("words and 987"));
    Assert.assertEquals(-2147483648, solution.myAtoi("-91283472332"));
    Assert.assertEquals(0, solution.myAtoi(" "));
  }

}
