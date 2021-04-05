package id.dondon.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 * Detail https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * */
public class FindAllNumbersDisappearedInAnArray {

  public List<Integer> findDisappearedNumbers(int[] nums) {
    int[] arr = new int[nums.length+1];
    List<Integer> result = new LinkedList<>();

    for (int i = 0; i < nums.length; i++) {
      int now = nums[i];
      if (arr[now] == 0)
        arr[now] = i+1;
    }

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == 0)
        result.add(i);
    }

    return result;
  }

}
