package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumberTest {

  @Test
  public void test() {
    SingleNumber solution = new SingleNumber();

    int[] input1 = new int[]{2,2,1};
    int expected1 = 1;
    Assert.assertEquals(expected1, solution.singleNumber(input1));

    int[] input2 = new int[]{4,1,2,1,2};
    int expected2 = 4;
    Assert.assertEquals(expected2, solution.singleNumber(input2));

    int[] input3 = new int[]{1};
    int expected3 = 1;
    Assert.assertEquals(expected3, solution.singleNumber(input3));
  }

}
