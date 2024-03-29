package id.dondon.leetcode.easy;

/**
 * Given two binary strings a and b
 * return their sum as a binary string.
 *
 * Detail https://leetcode.com/problems/add-binary/
 * */
public class AddBinary {

  public String addBinary(String a, String b) {
    int aIndex = a.length() - 1;
    int bIndex = b.length() - 1;
    int carry = 0;

    StringBuilder sb = new StringBuilder();
    while (aIndex >= 0 || bIndex >= 0) {
      int sum = carry;
      if (aIndex >= 0) sum += a.charAt(aIndex) - '0';
      if (bIndex >= 0) sum += b.charAt(bIndex) - '0';

      sb.append(sum%2);
      carry = sum / 2;

      aIndex--;
      bIndex--;
    }

    if (carry != 0) sb.append(carry);
    return sb.reverse().toString();
  }

}
