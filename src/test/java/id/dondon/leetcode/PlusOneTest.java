package id.dondon.leetcode;

import java.util.Arrays;
import java.util.List;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

  @Test
  public void test() {
    List<Pair<int[], int[]>> cases = Arrays.asList(
        new Pair(new int[]{1, 2, 3}, new int[]{1, 2, 4}),
        new Pair(new int[]{1, 9, 9}, new int[]{2, 0, 0}),
        new Pair(new int[]{9, 9, 9}, new int[]{1, 0, 0, 0})
    );

    PlusOne solution = new PlusOne();
    for (Pair<int[], int[]> test : cases) {
      Assert.assertArrayEquals(test.getValue(), solution.plusOne(test.getKey()));
    }
  }

}
