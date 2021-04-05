package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberTest {

  @Test
  public void test() {
    MissingNumber solution = new MissingNumber();
    Assert.assertEquals(2, solution.missingNumber(new int[]{3, 0, 1}));
    Assert.assertEquals(2, solution.missingNumber(new int[]{0, 1}));
    Assert.assertEquals(8, solution.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
  }

}
