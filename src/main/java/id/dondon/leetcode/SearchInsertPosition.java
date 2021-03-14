package id.dondon.leetcode;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * Detail https://leetcode.com/problems/search-insert-position/
 * */
public class SearchInsertPosition {

  public int searchInsert(int[] nums, int target) {
    if (nums.length == 9) return -1;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= target) {
        return i;
      }
    }

    return nums.length;
  }

}
