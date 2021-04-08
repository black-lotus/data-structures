package id.dondon.leetcode.easy;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class KidsWithTheGreatestNumberOfCandiesTest {

  @Test
  public void test() {
    KidsWithTheGreatestNumberOfCandies solution = new KidsWithTheGreatestNumberOfCandies();

    Assert.assertEquals(Arrays.asList(true,true,true,false,true), solution.kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    Assert.assertEquals(Arrays.asList(true,false,false,false,false), solution.kidsWithCandies(new int[]{4,2,1,1,2}, 1));
    Assert.assertEquals(Arrays.asList(true,false,false,false,false), solution.kidsWithCandies(new int[]{4,2,1,1,2}, 1));
  }

}
