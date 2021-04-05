package id.dondon.leetcode.easy;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * Follow up: Could you write a solution that works in logarithmic time complexity?
 *
 * Detail https://leetcode.com/problems/factorial-trailing-zeroes/
 * */
public class FactorialTrailingZeros {

  public int trailingZeroes(int n) {
    int numberOfFives = 0;

    while (n >= 5) {
      numberOfFives += (n / 5);
      n = n / 5;
    }

    return numberOfFives;
  }

}
