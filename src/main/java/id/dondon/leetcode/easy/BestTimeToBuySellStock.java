package id.dondon.leetcode.easy;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Detail https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/572/
 * */
public class BestTimeToBuySellStock {

  public int maxProfit(int[] prices) {
    int minPrice = prices[0];
    int profit = 0;
    for(int i = 1; i < prices.length; i++ ){
      int currentProfit = prices[i] - minPrice;
      if (currentProfit > profit) {
        profit = currentProfit;
      }

      // update min price
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }
    }

    return profit;
  }

}
