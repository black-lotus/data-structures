package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class MatrixDiagonalSumTest {

  @Test
  public void test() {
    MatrixDiagonalSum solution = new MatrixDiagonalSum();

    Assert.assertEquals(25, solution.diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    Assert.assertEquals(8, solution.diagonalSum(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}));
  }

}