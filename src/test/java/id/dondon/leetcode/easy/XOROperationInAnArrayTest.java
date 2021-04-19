package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class XOROperationInAnArrayTest {

  @Test
  public void test() {
    XOROperationInAnArray solution = new XOROperationInAnArray();

    Assert.assertEquals(8, solution.xorOperation(5, 0));
    Assert.assertEquals(8, solution.xorOperation(4, 3));
    Assert.assertEquals(7, solution.xorOperation(1, 7));
    Assert.assertEquals(2, solution.xorOperation(10, 5));
  }

}
