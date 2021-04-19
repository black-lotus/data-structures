package id.dondon.leetcode.easy;

/**
 * Given an integer n and an integer start.
 * Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
 * Return the bitwise XOR of all elements of nums.
 *
 * Detail https://leetcode.com/problems/xor-operation-in-an-array/
 * */
public class XOROperationInAnArray {

  public int xorOperation(int n, int start) {
    int result = 0;

    for (int i = 0; i < n; i++) {
      int nums = start + 2 * i;
      result ^= nums;
    }

    return result;
  }

}
