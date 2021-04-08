package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class CreateTargetArrayInTheGivenOrderTest {

  @Test
  public void test() {
    CreateTargetArrayInTheGivenOrder solution = new CreateTargetArrayInTheGivenOrder();

    Assert.assertArrayEquals(new int[]{0,4,1,3,2}, solution.createTargetArray(
        new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
  }

}
