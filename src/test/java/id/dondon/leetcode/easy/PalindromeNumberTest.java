package id.dondon.leetcode.easy;

import id.dondon.leetcode.easy.PalindromeNumber;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

  @Test
  public void test() {
    PalindromeNumber solution = new PalindromeNumber();

    int input1 = 121;
    boolean expected1 = true;
    Assert.assertEquals(expected1, solution.isPalindrome(input1));

    int input2 = -121;
    boolean expected2 = false;
    Assert.assertEquals(expected2, solution.isPalindrome(input2));

    int input3 = 20;
    boolean expected3 = false;
    Assert.assertEquals(expected3, solution.isPalindrome(input3));

    int input4 = 1234321;
    boolean expected4 = true;
    Assert.assertEquals(expected4, solution.isPalindrome(input4));
  }

}
