package id.dondon.leetcode.easy;

/**
 * Given a non-negative integer x, compute and return the square root of x.
 * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
 *
 * Detail https://leetcode.com/problems/sqrtx/
 * */
public class Sqrt {

  public int mySqrt(int x) {
    if (x < 2) return x;

    int ans = 0;
    int left = 1;
    int right = x;

    while(left <= right){
      int mid = left + (right - left)/2;

      if (mid == x/mid) {
        return mid;
      } else if( mid < x/mid) {
        ans = mid;
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return ans;
  }

}
