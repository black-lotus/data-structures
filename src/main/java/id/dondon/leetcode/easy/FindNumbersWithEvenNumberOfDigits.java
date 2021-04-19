package id.dondon.leetcode.easy;

/**
 * Detail https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * */
public class FindNumbersWithEvenNumberOfDigits {

  public int findNumbers(int[] nums) {
    int result = 0;

    for (int i = 0; i < nums.length; i++) {
      int curr = nums[i];
      int digits = 0;
      while (curr > 0) {
        curr /= 10;
        digits++;
      }

      if (digits % 2 == 0) {
        result += 1;
      }
    }

    return result;
  }

}
