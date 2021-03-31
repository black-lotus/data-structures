package id.dondon.leetcode.medium;

/**
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 *
 * Detail https://leetcode.com/problems/rotate-image/
 * */
public class RotateImage {

  public void rotate(int[][] matrix) {
    if (matrix.length == 0 || matrix.length != matrix[0].length) return;

    int n = matrix.length;
    for (int layer = 0; layer < n / 2; layer++) {
      int first = layer;
      int last = n - 1 - layer;
      for (int i = first; i < last; i++) {
        int offset = i - first;
        int top = matrix[first][i]; // save top

        // change top with left
        matrix[first][i] = matrix[last - offset][first];

        // change left with bottom
        matrix[last - offset][first] = matrix[last][last - offset];

        // change bottom with right
        matrix[last][last - offset] = matrix[i][last];

        // change right with rop
        matrix[i][last] = top;
      }
    }
  }

}
