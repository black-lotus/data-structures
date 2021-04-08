package id.dondon.leetcode.easy;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class CountItemsMatchingARuleTest {

  @Test
  public void test() {
    CountItemsMatchingARule solution = new CountItemsMatchingARule();

    Assert.assertEquals(1, solution.countMatches(Arrays.asList(
        Arrays.asList("phone","blue","pixel"),
        Arrays.asList("computer","silver","lenovo"),
        Arrays.asList("phone","gold","iphone")
    ), "color", "silver"));
  }

}
