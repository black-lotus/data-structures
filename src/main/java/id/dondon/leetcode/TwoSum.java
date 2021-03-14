package id.dondon.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Detail https://leetcode.com/problems/two-sum/
 * */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> stored = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int val = target - nums[i];
      if (stored.containsKey(val)) {
        return new int[]{
            stored.get(val),
            i
        };
      } else {
        stored.put(nums[i], i);
      }
    }

    return new int[]{
        -1, -1
    };
  }

}
