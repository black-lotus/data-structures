package id.dondon.leetcode.easy;

/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 *
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 * */
public class MissingNumber {

  public int missingNumber(int[] nums) {
    int sum = 0;
    boolean foundZero = false;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (nums[i] == 0) {
        foundZero = true;
      }
    }

    if (!foundZero) return 0;

    return ((nums.length * (nums.length + 1))/ 2) - sum;
  }

}
