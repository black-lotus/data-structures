package id.dondon.leetcode.medium;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function)
 *
 * Detail https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/884/
 * */
public class StringToInteger {

  public int myAtoi(String s) {
    if (s.isEmpty()) return 0;

    int idx = 0;
    while(idx < s.length() && s.charAt(idx) == ' ') idx++;

    long sign = 1l;
    if(idx < s.length()) {
      if (s.charAt(idx) == '-') {
        sign = -1l;
        idx++;
      } else if (s.charAt(idx) == '+') {
        idx++;
      }
    }


    if (idx < s.length() && !Character.isDigit(s.charAt(idx))) return 0;
    long sum = 0;
    while(idx < s.length() && Character.isDigit(s.charAt(idx))) {
      sum = sum * 10 + s.charAt(idx) - '0';
      if (sum > (long) Integer.MAX_VALUE && sign == 1l) return Integer.MAX_VALUE;
      if (sum > (long) Integer.MAX_VALUE + 1 && sign == -1l) return Integer.MIN_VALUE;
      idx++;
    }
    return (int) (sum * sign);
  }

}
