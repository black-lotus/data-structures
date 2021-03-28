package id.dondon.leetcode.easy;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * Find the maximum profit you can achieve.
 * You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 *
 * Detail https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
 * */
public class BestTimeToBuySellStock2 {

  public int maxProfit(int[] prices) {
    int maxProfit = 0;

    int lastBuy = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (lastBuy > prices[i]) {
        lastBuy = prices[i];
      } else {
        int sell = prices[i];
        int profit = sell - lastBuy;
        if (profit > 0) {
          maxProfit += profit;
        }
        lastBuy = sell;
      }
    }

    return maxProfit;
  }

}
