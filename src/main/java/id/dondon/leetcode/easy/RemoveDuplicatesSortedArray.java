package id.dondon.leetcode.easy;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Detail https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * */
public class RemoveDuplicatesSortedArray {

  public int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int idx = 0;
    for (int i=0; i<nums.length-1; i++) {
      if (nums[i] != nums[i+1]) {
        nums[idx++] = nums[i];
      }
    }
    nums[idx++] = nums[nums.length-1];
    return idx;
  }

}
