package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

  @Test
  public void test() {
    MajorityElement solution = new MajorityElement();

    Assert.assertEquals(3, solution.majorityElement(new int[]{3,2,3}));
    Assert.assertEquals(2, solution.majorityElement(new int[]{2,2,1,1,1,2,2}));
  }

}
