package id.dondon.leetcode.easy;

/**
 * Given an array nums.
 * We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 *
 * Detail https://leetcode.com/problems/running-sum-of-1d-array/
 * */
public class RunningSumOf1dArray {

  public int[] runningSum(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        nums[i] = nums[i];
      } else {
        int last = nums[i - 1];
        nums[i] = last + nums[i];
      }
    }

    return nums;
  }

}
