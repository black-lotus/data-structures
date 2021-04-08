package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartitionITest {

  @Test
  public void test() {
    ArrayPartitionI solution = new ArrayPartitionI();
    Assert.assertEquals(4, solution.arrayPairSum(new int[]{1,4,3,2}));
    Assert.assertEquals(9, solution.arrayPairSum(new int[]{6,2,6,5,1,2}));
  }

}
