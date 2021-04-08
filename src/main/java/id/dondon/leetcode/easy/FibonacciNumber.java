package id.dondon.leetcode.easy;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence,
 * called the Fibonacci sequence, such that each number is the sum of the two preceding ones,
 * starting from 0 and 1. That is,
 *
 * Detail https://leetcode.com/problems/fibonacci-number/
 * */
public class FibonacciNumber {

  public int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
  }

}
