package id.dondon.leetcode.easy;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SummaryRangesTest {

  @Test
  public void test() {
    SummaryRanges solution = new SummaryRanges();
    List<String> expected1 = Arrays.asList(
        "0->2", "4->5", "7"
    );
    Assert.assertEquals(expected1, solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));

    List<String> expected2 = Arrays.asList(
        "0", "2->4", "6", "8->9"
    );
    Assert.assertEquals(expected2, solution.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
  }

}
