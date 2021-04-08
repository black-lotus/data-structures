package id.dondon.leetcode.easy;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Detail https://leetcode.com/problems/max-consecutive-ones/
 * */
public class MaxConsecutiveOnes {

  public int findMaxConsecutiveOnes(int[] nums) {
    int max = 0;
    int current = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        current += nums[i];
        if (i + 1 == nums.length) {
          if (current > max) {
            max = current;
          }
        }
      } else {
        if (current > max) {
          max = current;
        }
        current = 0;
      }
    }

    return max;
  }

}
