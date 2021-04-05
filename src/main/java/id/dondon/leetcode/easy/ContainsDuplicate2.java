package id.dondon.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums and an integer k,
 * return true if there are two distinct indices i and j
 * in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Detail https://leetcode.com/problems/contains-duplicate-ii/
 * */
public class ContainsDuplicate2 {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<Integer,Integer>();

    for(int i=0; i<nums.length; i++) {
      if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
        return true;
      } else {
        map.put(nums[i], i);
      }
    }

    return false;
  }

}
