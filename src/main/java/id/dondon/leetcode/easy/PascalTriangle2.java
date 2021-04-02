package id.dondon.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 *
 * Detail https://leetcode.com/problems/pascals-triangle-ii/
 * */
public class PascalTriangle2 {

  public List<Integer> getRow(int rowIndex) {
    List<Integer> result = new ArrayList<>(rowIndex + 1);
    if (rowIndex == 0) {
      result.add(1);
      return result;
    }

    List<Integer> prev = getRow(rowIndex - 1);
    result.add(1);
    for(int i = 0; i < prev.size()-1; i++){
      result.add(prev.get(i) + prev.get(i+1));
    }
    result.add(1);

    return result;
  }

}
