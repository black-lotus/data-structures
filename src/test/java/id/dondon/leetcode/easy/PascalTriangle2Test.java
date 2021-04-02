package id.dondon.leetcode.easy;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class PascalTriangle2Test {

  @Test
  public void test() {
    PascalTriangle2 solution = new PascalTriangle2();
    List<Integer> expected = Arrays.asList(1, 3, 3, 1);
    Assert.assertEquals(expected, solution.getRow(3));
  }

}
