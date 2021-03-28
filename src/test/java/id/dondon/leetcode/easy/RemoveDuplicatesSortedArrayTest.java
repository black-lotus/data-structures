package id.dondon.leetcode.easy;

import id.dondon.leetcode.easy.RemoveDuplicatesSortedArray;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesSortedArrayTest {

  @Test
  public void test() {
    RemoveDuplicatesSortedArray solution = new RemoveDuplicatesSortedArray();

    int[] input = {1, 1, 2, 2, 3, 3, 5};
    int[] expected = {1, 2, 3, 5};
    int result = solution.removeDuplicates(input);
    Assert.assertEquals(4, result);
    for (int i = 0; i < result; i++) {
      Assert.assertEquals(expected[i], input[i]);
    }

  }

}
