package id.dondon.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleAnArrayTest {

  @Test
  public void test() {
    ShuffleAnArray solution = new ShuffleAnArray(new int[]{1, 2, 3});
    solution.shuffle();
    Assert.assertArrayEquals(new int[]{1, 2, 3}, solution.reset());
    solution.shuffle();
  }

}
