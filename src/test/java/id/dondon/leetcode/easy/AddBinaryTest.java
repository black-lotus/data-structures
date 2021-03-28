package id.dondon.leetcode.easy;

import id.dondon.leetcode.easy.AddBinary;
import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

  @Test
  public void test() {
    AddBinary solution = new AddBinary();

    String a1 = "11";
    String b1 = "1";
    String result1 = solution.addBinary(a1, b1);
    String expected1 = "100";
    Assert.assertEquals(expected1, result1);

    String a2 = "1010";
    String b2 = "1011";
    String result2 = solution.addBinary(a2, b2);
    String expected2 = "10101";
    Assert.assertEquals(expected2, result2);
  }

}
