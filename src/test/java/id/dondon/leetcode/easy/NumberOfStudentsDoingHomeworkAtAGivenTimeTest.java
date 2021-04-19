package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfStudentsDoingHomeworkAtAGivenTimeTest {

  @Test
  public void test() {
    NumberOfStudentsDoingHomeworkAtAGivenTime solution = new NumberOfStudentsDoingHomeworkAtAGivenTime();

    Assert.assertEquals(1, solution.busyStudent(new int[]{1, 2, 3}, new int[]{3, 2, 7}, 4));
    Assert.assertEquals(1, solution.busyStudent(new int[]{4}, new int[]{4}, 4));
  }

}