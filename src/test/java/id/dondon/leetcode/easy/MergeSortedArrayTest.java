package id.dondon.leetcode.easy;

import id.dondon.leetcode.easy.MergeSortedArray;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {

  @Test
  public void test() {
    MergeSortedArray solution = new MergeSortedArray();

    int[] input1 = new int[]{1,2,3,0,0,0};
    int size1 = 3;
    int[] input2 = new int[]{2,5,6};
    int size2 = 3;
    int[] expected = new int[]{1,2,2,3,5,6};
    solution.merge(input1, size1, input2, size2);
    Assert.assertArrayEquals(expected, input1);
  }

}
