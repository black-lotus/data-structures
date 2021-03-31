package id.dondon.leetcode.easy;

import id.dondon.leetcode.easy.Sqrt;
import java.util.Arrays;
import java.util.List;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

public class SqrtTest {

  @Test
  public void test() {
    List<Pair<Integer, Integer>> cases = Arrays.asList(
        new Pair<Integer, Integer>(9, 3),
        new Pair<Integer, Integer>(8, 2),
        new Pair<Integer, Integer>(2147395599, 46339)
    );

    Sqrt solution = new Sqrt();
    for (Pair<Integer, Integer> test : cases) {
      Assert.assertEquals((int) test.getValue(), solution.mySqrt(test.getKey()));
    }
  }

}
