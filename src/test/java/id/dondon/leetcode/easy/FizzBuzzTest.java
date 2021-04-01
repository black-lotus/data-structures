package id.dondon.leetcode.easy;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

  @Test
  public void test() {
    FizzBuzz solution = new FizzBuzz();
    List<String> result = solution.fizzBuzz(15);
    List<String> expected = Arrays.asList(
        "1",
        "2",
        "Fizz",
        "4",
        "Buzz",
        "Fizz",
        "7",
        "8",
        "Fizz",
        "Buzz",
        "11",
        "Fizz",
        "13",
        "14",
        "FizzBuzz"
    );

    Assert.assertEquals(expected, result);
  }

}
