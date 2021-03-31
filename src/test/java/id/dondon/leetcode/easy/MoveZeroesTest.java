package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

  @Test
  public void test() {
    MoveZeroes solution = new MoveZeroes();

    int[] input1 = new int[]{0,1,0,3,12};
    solution.moveZeroes(input1);
    Assert.assertArrayEquals(new int[]{1,3,12,0,0}, input1);
  }

}
