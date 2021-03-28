package id.dondon.leetcode.easy;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * Detail https://leetcode.com/problems/reverse-integer/submissions/
 * */
public class ReverseInteger {
  public int reverse(int x) {
    long reversed = 0;
    boolean isMinus = x < 0;
    if (isMinus) {
      x = x * -1;
    }

    while (x > 0) {
      reversed = reversed * 10 + x % 10;
      x = x / 10;
      if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
        return 0;
      }
    }

    if (isMinus) {
      return (int) (reversed * -1);
    }
    return (int) reversed;
  }
}
