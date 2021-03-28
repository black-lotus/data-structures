package id.dondon.leetcode.easy;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Detail https://leetcode.com/problems/climbing-stairs/
 * */
public class ClimbingStairs {

  public int climbStairs(int n) {
    int[] arr = new int[n + 1];
    arr[n] = 1;

    for (int i = n - 1; i >= 0; i--) {
      arr[i] = arr[i+1];
      if((i+2) <= n)
        arr[i] += (arr[i+2]);
    }

    return arr[0];
  }

}
