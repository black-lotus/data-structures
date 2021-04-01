package id.dondon.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Detail https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/878/
 * */
public class RomanToInteger {

  private Map<Character, Integer> maps;

  public RomanToInteger() {
    this.maps = new HashMap<Character, Integer>();
    this.maps.put('I', 1);
    this.maps.put('V', 5);
    this.maps.put('X', 10);
    this.maps.put('L', 50);
    this.maps.put('C', 100);
    this.maps.put('D', 500);
    this.maps.put('M', 1000);
  }

  public int romanToInt(String s) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      Character c = s.charAt(i);
      int val = this.maps.get(c);
      if (i != 0 && val > this.maps.get(s.charAt(i - 1))) {
        int prevVal = this.maps.get(s.charAt(i - 1));
        result += val - (2 * prevVal);
      } else {
        result += val;
      }
    }

    return result;
  }

}
