package id.dondon.leetcode.easy;

/**
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 *
 * Detail https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/745/
 * */
public class PowerOfThree {

  public boolean isPowerOfThree(int n) {
    if (n == 0 || n == 2) return false;
    if (n == 1) return true;

    while (n != 1) {
      if (n%3 != 0) return false;
      n = n/3;
    }

    return true;
  }

}
