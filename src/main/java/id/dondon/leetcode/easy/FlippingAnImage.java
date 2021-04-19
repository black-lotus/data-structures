package id.dondon.leetcode.easy;

/**
 * Detail https://leetcode.com/problems/flipping-an-image/
 * */
public class FlippingAnImage {

  public int[][] flipAndInvertImage(int[][] image) {
    for (int i = 0; i < image.length; i++) {
      int mid = image[i].length / 2;
      for (int j = 0; j < mid; j++) {
        int temp = image[i][j];
        image[i][j] = image[i][image[i].length - 1 - j] == 1 ? 0 : 1;
        image[i][image[i].length - 1 - j] = temp == 1 ? 0 : 1;
      }

      if (image[i].length % 2 != 0) {
        image[i][mid] = image[i][mid] == 1 ? 0 : 1;
      }
    }

    return image;
  }

}
