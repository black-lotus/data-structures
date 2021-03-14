package id.dondon.leetcode;

/**
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Detail https://leetcode.com/problems/implement-strstr/
 * */
public class ImplementStrStr {

  public int strStr(String haystack, String needle) {
    if (haystack.length() == 0 && needle.length() == 0) return 0;
    int jumpSize = needle.length();
    for (int i = 0; i < haystack.length() - (jumpSize - 1); i++) {
      String c = haystack.substring(i, i + jumpSize);
      if (c.equalsIgnoreCase(needle)) {
        return i;
      }
    }

    return -1;
  }

}
