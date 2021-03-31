package id.dondon.leetcode.easy;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
 *
 * Detail https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/549/
 * */
public class SingleNumber {

  public int singleNumber(int[] nums) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      result ^= nums[i];
    }

    return result;
  }

}
