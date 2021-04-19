package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class MinimumTimeVisitingAllPointsTest {

  @Test
  public void test() {
    MinimumTimeVisitingAllPoints solution = new MinimumTimeVisitingAllPoints();

    Assert.assertEquals(7, solution.minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{-1,0}}));
    Assert.assertEquals(5, solution.minTimeToVisitAllPoints(new int[][]{{3,2},{-2,2}}));
  }

}