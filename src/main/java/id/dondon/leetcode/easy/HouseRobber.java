package id.dondon.leetcode.easy;

/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have
 * security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house,
 * return the maximum amount of money you can rob tonight without alerting the police.
 *
 * Detail https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/576/
 * */
public class HouseRobber {

  public int rob(int[] nums) {
    if (nums.length == 1) return nums[0];

    int prevByOne=0;
    int prevByTwo=0;
    for (int i=0; i < nums.length; i++) {
      int cur = Math.max(nums[i]+prevByTwo, prevByOne);
      prevByTwo = prevByOne;
      prevByOne = cur;
    }

    return prevByOne;
  }

}
