package id.dondon.leetcode.easy;

import id.dondon.leetcode.easy.ClimbingStairs;
import java.util.Arrays;
import java.util.List;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {

  @Test
  public void test() {
    List<Pair<Integer, Integer>> cases = Arrays.asList(
        new Pair<Integer, Integer>(2, 2),
        new Pair<Integer, Integer>(3, 3)
    );

    ClimbingStairs solution = new ClimbingStairs();
    for (Pair<Integer, Integer> test : cases) {
      Assert.assertEquals((int) test.getValue(), solution.climbStairs(test.getKey()));
    }
  }

}
