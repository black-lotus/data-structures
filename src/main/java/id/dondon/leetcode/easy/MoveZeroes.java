package id.dondon.leetcode.easy;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 *
 * Detail https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/567/
 * */
public class MoveZeroes {

  public void moveZeroes(int[] nums) {
    if(nums.length ==0 || nums.length == 1)
      return;

    int low = 0;
    int high = 0;
    while(high < nums.length) {
      if(nums[high] == 0) {
        high++;
      } else if(nums[low] != 0 && nums[high] != 0) {
        high++;
        low++;
      } else {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
        low++;
        high++;
      }
    }
  }

}
