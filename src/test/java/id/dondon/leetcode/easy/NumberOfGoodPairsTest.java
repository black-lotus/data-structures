package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfGoodPairsTest {

  @Test
  public void test() {
    NumberOfGoodPairs solution = new NumberOfGoodPairs();

    Assert.assertEquals(4, solution.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    Assert.assertEquals(6, solution.numIdenticalPairs(new int[]{1,1,1,1}));
    Assert.assertEquals(0, solution.numIdenticalPairs(new int[]{1,2,3}));
  }

}
