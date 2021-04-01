package id.dondon.leetcode.easy;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * Detail https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/744/
 * */
public class CountPrime {

  public int countPrimes(int n) {
    boolean[] prime = new boolean[n];
    int count=0;
    for(int i=2; i<n; i++) {
      if (prime[i]) continue;
      count++;

      for (int j=2; j*i<n; j++) {
        prime[j*i] = true;
      }
    }

    return count;
  }

}
