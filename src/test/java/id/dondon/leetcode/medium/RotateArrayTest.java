package id.dondon.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {

  @Test
  public void test() {
    RotateArray solution = new RotateArray();

    int[] input = new int[]{1,2,3,4,5,6,7};
    int[] expected = new int[]{5,6,7,1,2,3,4};
    int k = 3;

    solution.rotate(input, k);
    Assert.assertArrayEquals(expected, input);
  }

}
