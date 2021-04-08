package id.dondon.leetcode.easy;

/**
 * Given an array consisting of n integers,
 * find the contiguous subarray of given length k that has the maximum average value.
 * And you need to output the maximum average value.
 *
 * Detail https://leetcode.com/problems/maximum-average-subarray-i/
 * */
public class MaximumAverageSubarrayI {

  public double findMaxAverage(int[] nums, int k) {
    double avg = 0;
    double sum = 0;

    for(int i=0;i<k;i++) {
      sum += nums[i];
    }

    avg = sum/k;

    int low = 1;
    int high = k;

    while(high<nums.length) {
      sum = sum - nums[low-1] + nums[high];
      avg = Math.max(avg, sum/k);
      low++;
      high++;
    }

    return avg;
  }

}
