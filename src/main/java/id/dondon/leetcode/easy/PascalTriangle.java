package id.dondon.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * Detail https://leetcode.com/problems/pascals-triangle/
 * */
public class PascalTriangle {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>(numRows);

    for (int i = 1; i <= numRows; i++) {
      List<Integer> child = new ArrayList<>(i);
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
          child.add(1);
        } else {
          List<Integer> prev = result.get(i - 2);
          int total = prev.get(j - 2) + prev.get(j - 1);
          child.add(total);
        }
      }

      result.add(child);
    }

    return result;
  }

}
