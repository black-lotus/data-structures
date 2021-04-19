package id.dondon.leetcode.easy;

/**
 * Detail https://leetcode.com/problems/count-good-triplets/
 * */
public class CountGoodTriplets {

  public int countGoodTriplets(int[] arr, int a, int b, int c) {
    int result = 0;

    for (int i = 0; i < arr.length - 2; i++) {
      for (int j = i + 1; j < arr.length - 1; j++) {
        int aResult = Math.abs(arr[i] - arr[j]);
        if (aResult > a) continue;
        for (int k = j + 1; k < arr.length; k++) {
          int bResult = Math.abs(arr[j] - arr[k]);
          int cResult = Math.abs(arr[i] - arr[k]);

          if (aResult <= a && bResult <= b && cResult <= c) {
            result += 1;
          }
        }
      }
    }

    return result;
  }

}
