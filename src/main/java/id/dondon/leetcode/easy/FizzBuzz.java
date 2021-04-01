package id.dondon.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 *
 * Detail https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/743/
 * */
public class FizzBuzz {

  private static final String FIZZ = "Fizz";
  private static final String BUZZ = "Buzz";
  private static final String FIZZ_BUZZ = "FizzBuzz";

  public List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<String>();
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        result.add(FIZZ_BUZZ);
      } else if (i % 3 == 0) {
        result.add(FIZZ);
      } else if (i % 5 == 0) {
        result.add(BUZZ);
      } else {
        result.add(i + "");
      }
    }

    return result;
  }

}
