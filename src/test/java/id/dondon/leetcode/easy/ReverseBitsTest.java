package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ReverseBitsTest {

  @Test
  public void test() {
    ReverseBits solution = new ReverseBits();

    Assert.assertEquals(-2147483648, solution.reverseBits(1));
    Assert.assertEquals(1, solution.reverseBits(-2147483648));
  }

}
