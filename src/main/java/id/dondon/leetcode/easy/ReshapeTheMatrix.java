package id.dondon.leetcode.easy;

/**
 * In MATLAB, there is a very useful function called 'reshape',
 * which can reshape a matrix into a new one with different size but keep its original data.
 *
 * You're given a matrix represented by a two-dimensional array,
 * and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
 *
 * The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
 *
 * If the 'reshape' operation with given parameters is possible and legal,
 * output the new reshaped matrix; Otherwise, output the original matrix.
 *
 * Detail https://leetcode.com/problems/reshape-the-matrix/
 * */
public class ReshapeTheMatrix {

  public int[][] matrixReshape(int[][] nums, int r, int c) {
    int rows = nums.length;
    int cols = nums[0].length;
    if (r * c != rows * cols) {
      return nums;
    }

    int[][] result = new int[r][c];

    int rowIndex = 0;
    int colIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        result[rowIndex][colIndex] = nums[i][j];
        if (colIndex + 1 >= c) {
          colIndex = 0;
          rowIndex++;
        } else {
          colIndex++;
        }
      }
    }

    return result;
  }

}
