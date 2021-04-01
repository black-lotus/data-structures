package id.dondon.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums, design an algorithm to randomly shuffle the array.
 *
 * Detail https://leetcode.com/explore/interview/card/top-interview-questions-easy/98/design/670/
 * */
public class ShuffleAnArray {

  private int[] nums;
  private int length;
  private List<Integer> list = new ArrayList();

  public ShuffleAnArray(int[] nums) {
    this.nums = nums;
    length = nums.length;
    for (int i : nums) {
      list.add(i);
    }
  }

  /** Resets the array to its original configuration and return it. */
  public int[] reset() {
    return nums;
  }

  /** Returns a random shuffling of the array. */
  public int[] shuffle() {
    int[] temp = new int[nums.length];
    int len = length;
    List<Integer> list = new ArrayList(this.list);

    for (int i = 0; i < nums.length; i++) {
      int n  = (int)(Math.random() * len);
      temp[i] = list.get(n);
      list.remove(n);
      len--;
    }

    return temp;
  }

}
