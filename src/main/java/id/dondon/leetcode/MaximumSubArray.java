package id.dondon.leetcode;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 *
 * Detail https://leetcode.com/problems/maximum-subarray/
 * */
public class MaximumSubArray {

  public int maxSubArray(int[] nums) {
    int max = nums[0];
    int sum = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (sum + nums[i] < nums[i]) {
        sum = 0;
      }

      sum += nums[i];

      if (sum > max) {
        max = sum;
      }
    }

    return max;
  }

}
