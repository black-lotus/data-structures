package id.dondon.leetcode.easy;

/**
 * Given a string columnTitle that represents the column title as appear in an Excel sheet,
 * return its corresponding column number.
 *
 * Detail https://leetcode.com/problems/excel-sheet-column-number/
 * */
public class ExcelSheetColumnNumber {

  public int titleToNumber(String columnTitle) {
    int result = 0;

    for (int i = 0; i < columnTitle.length(); i++) {
      int c = columnTitle.charAt(i);
      int number = (c - 65) + 1;
      result = (result * 26) + number;
    }

    return result;
  }

}
