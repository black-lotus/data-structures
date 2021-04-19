package id.dondon.leetcode.easy;

/**
 * Detail https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 * */
public class CellsWithOddValuesInAMatrix {

  public int oddCells(int m, int n, int[][] indices) {
    int[][] s = new int[m][n];
    for(int i[] : indices) {
      int r = i[0];
      int c = i[1];
      for(int j = 0; j < m; j++) {
        s[j][c]++;
      }
      for(int j = 0; j < n; j++) {
        s[r][j]++;
      }
    }
    int r = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (s[i][j] % 2 != 0) r++;
      }
    }
    return r;
  }

}
