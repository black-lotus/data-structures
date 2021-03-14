package id.dondon.leetcode;

public class LengthOfLastWord {

  public int lengthOfLastWord(String s) {
    int length = 0;
    String newStr = s.trim();
    for (int i = newStr.length() - 1; i >= 0; i--) {
      if (newStr.charAt(i) == ' ') {
        break;
      }
      length++;
    }
    return length;
  }

}
