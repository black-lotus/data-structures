package id.dondon.leetcode.easy;

/**
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
 * For each such pair, there are freq elements with value val concatenated in a sublist.
 * Concatenate all the sublists from left to right to generate the decompressed list.
 *
 * Return the decompressed list.
 *
 * Detail https://leetcode.com/problems/decompress-run-length-encoded-list/
 * */
public class DecompressRunLengthEncodedList {

  public int[] decompressRLElist(int[] nums) {
    int totalFreq = 0;
    for (int i = 0; i < nums.length; i += 2) {
      totalFreq += nums[i];
    }

    int[] result = new int[totalFreq];
    int index = 0;
    for (int i = 0; i < nums.length; i += 2) {
      int freq = nums[i];
      int val = nums[i + 1];
      for (int j = 0; j < freq; j++) {
        result[index++] = val;
      }
    }

    return result;
  }

}
