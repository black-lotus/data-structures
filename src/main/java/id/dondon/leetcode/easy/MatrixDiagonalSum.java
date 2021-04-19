package id.dondon.leetcode.easy;

/**
 * Detail https://leetcode.com/problems/matrix-diagonal-sum/
 * */
public class MatrixDiagonalSum {

  public int diagonalSum(int[][] mat) {
    int sum = 0;

    boolean isEven = mat.length % 2 == 0;
    for (int i = 0; i < mat.length; i++) {
      int[] m = mat[i];
      int left = m[i];
      int right = m[m.length - 1 - i];
      if (!isEven && i == (m.length - 1 - i)) {
        sum = sum + left;
      } else {
        sum = sum + left + right;
      }
    }

    return sum;
  }

}
