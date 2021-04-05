package id.dondon.leetcode.easy;


import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class FindAllNumbersDisappearedInAnArrayTest {

  @Test
  public void test() {
    FindAllNumbersDisappearedInAnArray solution = new FindAllNumbersDisappearedInAnArray();
    Assert.assertEquals(Arrays.asList(5,6), solution.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    Assert.assertEquals(Arrays.asList(2), solution.findDisappearedNumbers(new int[]{1,1}));
  }

}