package id.dondon.leetcode.easy;

/**
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Detail https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/883/
 * */
public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    StringBuilder builder = new StringBuilder();
    int n = s.length();
    for ( int i = 0 ; i < n ; i++) {
      char c = s.charAt(i);
      if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
        builder.append(c);
      }
      if ((c >= 'A' && c <= 'Z')) {
        char lowerC = (char) (c - ('Z' - 'z'));
        builder.append(lowerC);
      }
    }

    String palindrome = builder.toString();
    n = palindrome.length();
    for ( int i = 0 ; i< n/2 ; i++) {
      char first = palindrome.charAt(i);
      char last = palindrome.charAt(n - i - 1);
      if (first != last)
        return false;
    }

    return true;
  }
  
}
