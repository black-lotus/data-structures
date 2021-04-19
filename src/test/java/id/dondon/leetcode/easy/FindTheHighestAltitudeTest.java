package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class FindTheHighestAltitudeTest {

  @Test
  public void test() {
    FindTheHighestAltitude solution = new FindTheHighestAltitude();

    Assert.assertEquals(1, solution.largestAltitude(new int[]{-5,1,5,0,-7}));
    Assert.assertEquals(0, solution.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
  }

}
