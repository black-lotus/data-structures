package id.dondon.leetcode.easy;

/**
 * Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
 * A subarray is a contiguous subsequence of the array.
 * Return the sum of all odd-length subarrays of arr.
 *
 * Detail https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 * */
public class SumOfAllOddLengthSubarrays {

  public int sumOddLengthSubarrays(int[] arr) {
    int sum = 0;

    int len = arr.length;
    for (int i = 0; i < len; i++) {
      int occurence = ((len - i) * (i + 1) + 1) / 2;
      sum += arr[i] * occurence;
    }

    return sum;
  }

}
