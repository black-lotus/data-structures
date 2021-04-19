package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class CellsWithOddValuesInAMatrixTest {

  @Test
  public void test() {
    CellsWithOddValuesInAMatrix solution = new CellsWithOddValuesInAMatrix();

    Assert.assertEquals(6, solution.oddCells(2, 3, new int[][]{{0,1},{1,1}}));
    Assert.assertEquals(0, solution.oddCells(2, 2, new int[][]{{1,1},{0,0}}));
  }

}