package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class CountPrimeTest {

  @Test
  public void test() {
    CountPrime solution = new CountPrime();

    Assert.assertEquals(0, solution.countPrimes(2));
    Assert.assertEquals(4, solution.countPrimes(10));
  }

}
