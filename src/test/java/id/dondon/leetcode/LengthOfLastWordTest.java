package id.dondon.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {

  @Test
  public void test() {
    LengthOfLastWord solution = new LengthOfLastWord();

    String input1 = "Hello World";
    int result1 = solution.lengthOfLastWord(input1);
    int expected1 = 5;
    Assert.assertEquals(expected1, result1);

    String input2 = "        ";
    int result2 = solution.lengthOfLastWord(input2);
    int expected2 = 0;
    Assert.assertEquals(expected2, result2);

    String input3 = "a ";
    int result3 = solution.lengthOfLastWord(input3);
    int expected3 = 1;
    Assert.assertEquals(expected3, result3);
  }

}
