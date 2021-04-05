package id.dondon.leetcode.easy;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Detail https://leetcode.com/problems/reverse-bits/
 * */
public class ReverseBits {

  // you need treat n as an unsigned value
  public int reverseBits(int n) {
    int result = 0;
    for(int i = 0; i< 32; i++){
      int lstbit = n &1;
      n=n>>>1;
      result = (result << 1) ^ lstbit;
    }
    return result;
  }

}
