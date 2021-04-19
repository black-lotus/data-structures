package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class SumOfAllOddLengthSubarraysTest {

  @Test
  public void test() {
    SumOfAllOddLengthSubarrays solution = new SumOfAllOddLengthSubarrays();

    Assert.assertEquals(58, solution.sumOddLengthSubarrays(new int[]{1,4,2,5,3}));
    Assert.assertEquals(3, solution.sumOddLengthSubarrays(new int[]{1,2}));
  }

}
