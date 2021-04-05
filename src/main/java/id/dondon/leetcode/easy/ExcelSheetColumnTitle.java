package id.dondon.leetcode.easy;

/**
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 *
 * Detail https://leetcode.com/problems/excel-sheet-column-title/
 * */
public class ExcelSheetColumnTitle {

  public String convertToTitle(int columnNumber) {
    StringBuilder sb = new StringBuilder();

    while (columnNumber > 0) {
      sb.append((char)((--columnNumber % 26) + 65));
      columnNumber = columnNumber / 26;
    }

    return sb.reverse().toString();
  }

}
