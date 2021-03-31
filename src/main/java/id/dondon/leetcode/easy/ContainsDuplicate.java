package id.dondon.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> existing = new HashSet<Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (existing.contains(nums[i])) {
        return true;
      }

      existing.add(nums[i]);
    }

    return false;
  }

}
