package id.dondon.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

  @Test
  public void test() {
    SearchInsertPosition solution = new SearchInsertPosition();

    int[] input1 = new int[]{1, 3, 5, 6};
    int insert1 = 7;
    int result1 = solution.searchInsert(input1, insert1);
    int expected1 = 4;
    Assert.assertEquals(expected1, result1);

    int[] input2 = new int[]{1, 3, 5, 6};
    int insert2 = 2;
    int result2 = solution.searchInsert(input2, insert2);
    int expected2 = 1;
    Assert.assertEquals(expected2, result2);

    int[] input3 = new int[]{1};
    int insert3 = 0;
    int result3 = solution.searchInsert(input3, insert3);
    int expected3 = 0;
    Assert.assertEquals(expected3, result3);
  }

}
