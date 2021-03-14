package id.dondon.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ImplementStrStrTest {

  @Test
  public void test() {
    ImplementStrStr solution = new ImplementStrStr();

    String haystack1 = "hello";
    String needle1 = "ll";
    int result1 = solution.strStr(haystack1, needle1);
    int expected1 = 2;
    Assert.assertEquals(expected1, result1);

    String haystack2 = "hello";
    String needle2 = "jj";
    int result2 = solution.strStr(haystack2, needle2);
    int expected2 = -1;
    Assert.assertEquals(expected2, result2);

    String haystack3 = "";
    String needle3 = "a";
    int result3 = solution.strStr(haystack3, needle3);
    int expected3 = -1;
    Assert.assertEquals(expected3, result3);

    String haystack4 = "";
    String needle4 = "";
    int result4 = solution.strStr(haystack4, needle4);
    int expected4 = 0;
    Assert.assertEquals(expected4, result4);

    String haystack5 = "a";
    String needle5 = "a";
    int result5 = solution.strStr(haystack5, needle5);
    int expected5 = 0;
    Assert.assertEquals(expected5, result5);
  }

}
