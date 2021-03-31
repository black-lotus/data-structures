package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

  @Test
  public void test() {
    ReverseString solution = new ReverseString();

    char[] input = new char[]{'h','e','l','l','o'};
    char[] expected = new char[]{'o','l','l','e','h'};

    solution.reverseString(input);
    Assert.assertArrayEquals(expected, input);
  }

}
