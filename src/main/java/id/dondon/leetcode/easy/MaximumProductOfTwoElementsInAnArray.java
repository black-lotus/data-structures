package id.dondon.leetcode.easy;

/**
 * Given the array of integers nums, you will choose two different indices i and j of that array.
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 *
 * Detail https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 * */
public class MaximumProductOfTwoElementsInAnArray {

  public int maxProduct(int[] nums) {
    int max1 = 0;
    int max2 = 0;

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (num > max1) {
        max2 = max1;
        max1 = num;
      } else if(num > max2) {
        max2 = num;
      }
    }

    return (max1 - 1) * (max2 - 1);
  }

}
