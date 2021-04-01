package id.dondon.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Detail https://leetcode.com/explore/interview/card/top-interview-questions-easy/98/design/562/
 * */
public class MinStack {

  private List<Integer> stack;
  private List<Integer> mins;

  /** initialize your data structure here. */
  public MinStack() {
    stack = new ArrayList<>();
    mins = new ArrayList<>();
  }

  public void push(int val) {
    int minVal = val;
    if (mins.size() > 0) {
      minVal = mins.get(mins.size() - 1);
    }

    if (val <= minVal) {
      mins.add(val);
    }

    stack.add(val);
  }

  public void pop() {
    int val = stack.remove(stack.size() - 1);
    if (val == getMin()) {
      mins.remove(mins.size() - 1);
    }
  }

  public int top() {
    return stack.get(stack.size() - 1);
  }

  public int getMin() {
    if (mins.size() > 0)
      return mins.get(mins.size() - 1);

    return Integer.MIN_VALUE;
  }

}
