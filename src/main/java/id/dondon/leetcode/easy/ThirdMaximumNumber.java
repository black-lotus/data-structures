package id.dondon.leetcode.easy;

/**
 * Given integer array nums, return the third maximum number in this array.
 * If the third maximum does not exist, return the maximum number.
 *
 * Detail https://leetcode.com/problems/third-maximum-number/
 * */
public class ThirdMaximumNumber {

  public int thirdMax(int[] nums) {
    Integer firstMax = null;
    Integer secondMax = null;
    Integer thirdMax = null;

    for (int i = 0; i < nums.length; i++) {
      Integer val = nums[i];
      if (val.equals(firstMax) || val.equals(secondMax) || val.equals(thirdMax)) continue;

      if (firstMax == null || val > firstMax) {
        thirdMax = secondMax;
        secondMax = firstMax;
        firstMax = val;
      } else if (secondMax == null || val > secondMax) {
        thirdMax = secondMax;
        secondMax = val;
      } else if (thirdMax == null || val > thirdMax) {
        thirdMax = val;
      }
    }

    if (thirdMax == null) return firstMax;

    return thirdMax;
  }

}
