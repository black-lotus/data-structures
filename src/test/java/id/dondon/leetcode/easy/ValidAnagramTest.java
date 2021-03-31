package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ValidAnagramTest {

  @Test
  public void test() {
    ValidAnagram solution = new ValidAnagram();

    Assert.assertTrue(solution.isAnagram("anagram", "nagaram"));
    Assert.assertFalse(solution.isAnagram("rat", "car"));
  }

}
