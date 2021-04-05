package id.dondon.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * You are given a sorted unique integer array nums.
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
 * Each range [a,b] in the list should be output as:
 *
 * "a->b" if a != b
 * "a" if a == b
 *
 * Detail https://leetcode.com/problems/summary-ranges/
 * */
public class SummaryRanges {

  public List<String> summaryRanges(int[] nums) {
    List<String> result = new LinkedList<>();
    if (nums.length == 0) return result;
    if (nums.length == 1) {
      result.add(nums[0] + "");
      return result;
    }

    int startIndex = 0;
    int endIndex = 0;
    for (int i = 1; i < nums.length; i++) {
      int prev = nums[i - 1];
      int current = nums[i];
      if (prev + 1 == current) {
        endIndex = i;
      } else {
        if (startIndex >= endIndex) {
          result.add(nums[startIndex] + "");
        } else {
          result.add(nums[startIndex] + "->" + nums[endIndex]);
        }
        startIndex = i;
      }
    }

    if (startIndex >= endIndex) {
      result.add(nums[startIndex] + "");
    } else {
      result.add(nums[startIndex] + "->" + nums[endIndex]);
    }

    return result;
  }

}
