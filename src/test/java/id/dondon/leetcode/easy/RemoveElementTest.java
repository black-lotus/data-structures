package id.dondon.leetcode.easy;

import id.dondon.leetcode.easy.RemoveElement;
import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

  @Test
  public void test() {
    RemoveElement solution = new RemoveElement();

    int[] input = {0, 1, 2, 2, 3, 4, 5};
    int[] expected = {0, 1, 3, 4, 5};
    int result = solution.removeElement(input, 2);
    Assert.assertEquals(5, result);
    for (int i = 0; i < result; i++) {
      Assert.assertEquals("index: " + i, expected[i], input[i]);
    }

  }

}
