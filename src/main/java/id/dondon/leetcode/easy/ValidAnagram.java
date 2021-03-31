package id.dondon.leetcode.easy;

public class ValidAnagram {

  private static final char A = 'a';

  public boolean isAnagram(String s, String t) {
    char[] charsS = new char[26];
    char[] charsT = new char[26];

    char[] arrS = s.toCharArray();
    for(char ch : arrS)
      charsS[ch-A]++;

    char[] arrT = t.toCharArray();
    for(char ch : arrT)
      charsT[ch-A]++;

    for (int i = 0; i < charsS.length; i++) {
      if (charsS[i] != charsT[i]) return false;
    }

    return true;
  }

}
