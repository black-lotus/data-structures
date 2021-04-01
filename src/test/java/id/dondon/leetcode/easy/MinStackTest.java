package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class MinStackTest {

  @Test
  public void test() {
    MinStack solution = new MinStack();
    solution.push(-2);
    solution.push(0);
    solution.push(-3);
    Assert.assertEquals(-3, solution.getMin()); // return -3
    solution.pop();
    Assert.assertEquals(0, solution.top());    // return 0
    Assert.assertEquals(-2, solution.getMin()); // return -2

    MinStack solution2 = new MinStack();
    solution2.push(2);
    solution2.push(0);
    solution2.push(3);
    solution2.push(0);
    Assert.assertEquals(0, solution2.getMin()); // return 0
    solution2.pop();
    Assert.assertEquals(0, solution2.getMin()); // return 0
    solution2.pop();
    Assert.assertEquals(0, solution2.getMin()); // return 0
    solution2.pop();
    Assert.assertEquals(2, solution2.getMin()); // return 2

    MinStack solution3 = new MinStack();
    solution3.push(2147483646);
    solution3.push(2147483646);
    solution3.push(2147483647);
    Assert.assertEquals(2147483647, solution3.top()); // return 2147483647
    solution3.pop();
    Assert.assertEquals(2147483646, solution3.getMin()); // return 2147483646
    solution3.pop();
    Assert.assertEquals(2147483646, solution3.getMin()); // return 2147483646
    solution3.pop();
    solution3.push(2147483647);
    Assert.assertEquals(2147483647, solution3.top()); // return 2147483647
    Assert.assertEquals(2147483647, solution3.getMin()); // return 2147483647
    solution3.push(-2147483648);
    Assert.assertEquals(-2147483648, solution3.top()); // return -2147483648
    Assert.assertEquals(-2147483648, solution3.getMin()); // return -2147483648
    solution3.pop();
    Assert.assertEquals(2147483647, solution3.getMin()); // return 2147483647
  }

}
