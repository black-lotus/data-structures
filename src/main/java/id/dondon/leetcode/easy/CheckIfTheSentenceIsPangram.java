package id.dondon.leetcode.easy;

/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 *
 * Detail https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 * */
public class CheckIfTheSentenceIsPangram {

  private static final char A = 'a';

  public boolean checkIfPangram(String sentence) {
    int[] chars = new int[26];
    for (int i = 0; i < sentence.length(); i++) {
      int index = sentence.charAt(i) - A;
      chars[index]++;
    }

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 0) return false;
    }

    return true;
  }

  public boolean checkIfPangramBinary(String sentence) {
    int seen = 0;
    for(char c : sentence.toCharArray()) {
      int ci = c - 'a';
      seen = seen | (1 << ci);
    }
    return seen == ((1 << 26) - 1);
  }

}
