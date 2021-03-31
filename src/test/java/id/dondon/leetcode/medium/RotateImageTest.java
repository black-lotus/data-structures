package id.dondon.leetcode.medium;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateImageTest {

  @Test
  public void test() {
    RotateImage solution = new RotateImage();

    int[][] matrix = {
        {1, 1, 1, 1},
        {2, 2, 2, 2},
        {3, 3, 3, 3},
        {4, 4, 4, 4}
    };

    solution.rotate(matrix);

    int[][] expected = {
        {4, 3, 2, 1},
        {4, 3, 2, 1},
        {4, 3, 2, 1},
        {4, 3, 2, 1}
    };
    assertArrayEquals(expected, matrix);
  }

}
