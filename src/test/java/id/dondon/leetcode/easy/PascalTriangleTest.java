package id.dondon.leetcode.easy;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class PascalTriangleTest {

  @Test
  public void test() {
    PascalTriangle solution = new PascalTriangle();
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(1),
        Arrays.asList(1, 1),
        Arrays.asList(1, 2, 1),
        Arrays.asList(1, 3, 3, 1),
        Arrays.asList(1, 4, 6, 4, 1)
    );
    Assert.assertEquals(expected, solution.generate(5));
  }

}
