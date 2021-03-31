package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionOf2ArrayIITest {

  @Test
  public void test() {
    IntersectionOf2ArrayII solution = new IntersectionOf2ArrayII();

    int[] a1 = new int[]{1,2,2,1};
    int[] b1 = new int[]{2,2};
    Assert.assertArrayEquals(new int[]{2, 2}, solution.intersect(a1, b1));

    int[] a2 = new int[]{4,9,5};
    int[] b2 = new int[]{9,4,9,8,4};
    Assert.assertArrayEquals(new int[]{4, 9}, solution.intersect(a2, b2));
  }

}
