package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumberTest {

  @Test
  public void test() {
    FibonacciNumber solution = new FibonacciNumber();
    Assert.assertEquals(0, solution.fib(0));
    Assert.assertEquals(1, solution.fib(1));
    Assert.assertEquals(1, solution.fib(2));
    Assert.assertEquals(2, solution.fib(3));
    Assert.assertEquals(3, solution.fib(4));
  }

}
