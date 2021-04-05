package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicate2Test {

  @Test
  public void test() {
    ContainsDuplicate2 solution = new ContainsDuplicate2();
    Assert.assertTrue(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    Assert.assertTrue(solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    Assert.assertFalse(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
  }

}
