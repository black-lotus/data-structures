package id.dondon.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

  @Test
  public void test() {
    LongestCommonPrefix solution = new LongestCommonPrefix();

    String[] input1 = {"flower","flow","flight"};
    String expected1 = "fl";
    Assert.assertEquals(expected1, solution.longestCommonPrefix(input1));

//    String[] input2 = {"dog","racecar","car"};
//    String expected2 = "";
//    Assert.assertEquals(expected2, solution.longestCommonPrefix(input2));
//
//    String[] input3 = {"a"};
//    String expected3 = "a";
//    Assert.assertEquals(expected3, solution.longestCommonPrefix(input3));
//
//    String[] input4 = {"", "b"};
//    String expected4 = "";
//    Assert.assertEquals(expected4, solution.longestCommonPrefix(input4));
  }

}
