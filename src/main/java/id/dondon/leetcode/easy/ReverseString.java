package id.dondon.leetcode.easy;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * Detail https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/879/
 * */
public class ReverseString {

  public void reverseString(char[] s) {
    int length = s.length;
    int mid = length/2;
    int left = 0;
    int right = length - 1;
    while (left < mid) {
      char temp = s[left];
      s[left] = s[right];
      s[right] = temp;
      left++;
      right--;
    }
  }

}
