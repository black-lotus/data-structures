package id.dondon.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums.
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 * Return the number of good pairs.
 *
 * Detail https://leetcode.com/problems/number-of-good-pairs/
 * */
public class NumberOfGoodPairs {

  public int numIdenticalPairs(int[] nums) {
    int identicalTotal = 0;

    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (int freq : map.values()) {
      if (freq > 1) identicalTotal += ((freq * (freq-1)) >> 1);
    }

    return identicalTotal;
  }

}
