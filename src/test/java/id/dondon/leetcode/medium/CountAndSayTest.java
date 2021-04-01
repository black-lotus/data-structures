package id.dondon.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class CountAndSayTest {

  @Test
  public void test() {
    CountAndSay solution = new CountAndSay();

    Assert.assertEquals("1", solution.countAndSay(1));
    Assert.assertEquals("11", solution.countAndSay(2));
    Assert.assertEquals("21", solution.countAndSay(3));
    Assert.assertEquals("1211", solution.countAndSay(4));
  }

}
