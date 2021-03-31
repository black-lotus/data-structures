package id.dondon.leetcode.easy;

/**
 * Given a string s, return the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 *
 * Detail https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/881/
 * */
public class FirstUniqueCharacterInString {

  private static final char A = 'a';

  public int firstUniqChar(String s) {
    char[] chs = new char[26];

    char[] arr = s.toCharArray();
    for(char ch : arr)
      chs[ch-A]++;

    for(int i=0;i<s.length();i++){
      if (chs[s.charAt(i)-A] == 1)
        return i;
    }

    return -1;
  }

}
