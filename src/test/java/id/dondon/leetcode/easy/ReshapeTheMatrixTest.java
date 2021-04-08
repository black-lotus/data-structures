package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ReshapeTheMatrixTest {

  @Test
  public void test() {
    ReshapeTheMatrix solution = new ReshapeTheMatrix();

    int[][] input1 = new int[][]{
        {1, 2},
        {3, 4}
    };

    Assert.assertArrayEquals(new int[][]{{1, 2, 3, 4}}, solution.matrixReshape(input1, 1, 4));
    Assert.assertArrayEquals(new int[][]{{1}, {2}, {3}, {4}}, solution.matrixReshape(input1, 4, 1));
  }

}
