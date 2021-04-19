package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class FlippingAnImageTest {

  @Test
  public void test() {
    FlippingAnImage solution = new FlippingAnImage();

    Assert.assertArrayEquals(new int[][]{{1,0,0},{0,1,0},{1,1,1}}, solution.flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}}));
  }

}