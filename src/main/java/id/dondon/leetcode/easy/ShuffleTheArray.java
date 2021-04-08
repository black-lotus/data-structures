package id.dondon.leetcode.easy;

/**
 * Detail https://leetcode.com/problems/shuffle-the-array/
 * */
public class ShuffleTheArray {

  public int[] shuffle(int[] nums, int n) {
    int[] result = new int[nums.length];
    int index = 0;
    for (int i = 0; i < n; i++) {
      int x = nums[i];
      int y = nums[n + i];
      result[index++] = x;
      result[index++] = y;
    }

    return result;
  }

}
