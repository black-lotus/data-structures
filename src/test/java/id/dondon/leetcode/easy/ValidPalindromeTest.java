package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {

  @Test
  public void test() {
    ValidPalindrome solution = new ValidPalindrome();

    Assert.assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    Assert.assertFalse(solution.isPalindrome("race a car"));
  }

}
