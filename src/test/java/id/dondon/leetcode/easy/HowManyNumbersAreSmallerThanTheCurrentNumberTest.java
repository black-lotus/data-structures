package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

  @Test
  public void test() {
    HowManyNumbersAreSmallerThanTheCurrentNumber solution = new HowManyNumbersAreSmallerThanTheCurrentNumber();

    Assert.assertArrayEquals(new int[]{2,1,0,3}, solution.smallerNumbersThanCurrent(new int[]{6,5,4,8}));
    Assert.assertArrayEquals(new int[]{0,0,0,0}, solution.smallerNumbersThanCurrent(new int[]{7,7,7,7}));
  }

}
