package id.dondon.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class DesignAnOrderedStreamTest {

  @Test
  public void test() {
    DesignAnOrderedStream solution = new DesignAnOrderedStream(5);

    Assert.assertEquals(new ArrayList<String>(), solution.insert(3, "ccccc"));
    Assert.assertEquals(Arrays.asList("aaaaa"), solution.insert(1, "aaaaa"));
    Assert.assertEquals(Arrays.asList("bbbbb", "ccccc"), solution.insert(2, "bbbbb"));
    Assert.assertEquals(new ArrayList<String>(), solution.insert(5, "eeeee"));
    Assert.assertEquals(Arrays.asList("ddddd", "eeeee"), solution.insert(4, "ddddd"));
  }

}
