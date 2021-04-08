package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesTest {

  @Test
  public void test() {
    MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
    Assert.assertEquals(3, solution.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    Assert.assertEquals(1, solution.findMaxConsecutiveOnes(new int[]{1}));
    Assert.assertEquals(0, solution.findMaxConsecutiveOnes(new int[]{0}));
  }

}
