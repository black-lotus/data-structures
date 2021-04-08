package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleTheArrayTest {

  @Test
  public void test() {
    ShuffleTheArray solution = new ShuffleTheArray();

    Assert.assertArrayEquals(new int[]{2,3,5,4,1,7}, solution.shuffle(new int[]{2,5,1,3,4,7}, 3));
    Assert.assertArrayEquals(new int[]{1,4,2,3,3,2,4,1}, solution.shuffle(new int[]{1,2,3,4,4,3,2,1}, 4));
    Assert.assertArrayEquals(new int[]{1,2,1,2}, solution.shuffle(new int[]{1,1,2,2}, 2));
  }

}
