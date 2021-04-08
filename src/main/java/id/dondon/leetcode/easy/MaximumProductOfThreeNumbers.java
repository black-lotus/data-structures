package id.dondon.leetcode.easy;

import java.util.Arrays;

/**
 * Given an integer array nums,
 * find three numbers whose product is maximum and return the maximum product.
 *
 * Detail https://leetcode.com/problems/maximum-product-of-three-numbers/
 * */
public class MaximumProductOfThreeNumbers {

  public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int l = nums.length;
    int p1 = nums[l-3] * nums[l-2] * nums[l-1];
    int p2 = nums[0] * nums[1] * nums[l-1];
    return Math.max(p1, p2);
  }

}
