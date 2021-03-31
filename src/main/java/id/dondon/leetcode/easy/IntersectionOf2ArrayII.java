package id.dondon.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 *
 * Detail https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/674/
 * */
public class IntersectionOf2ArrayII {

  public int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> arr = new ArrayList<Integer>();

    int l1 = 0;
    int l2 = 0;

    Arrays.sort(nums1);
    Arrays.sort(nums2);
    while(l1 < nums1.length && l2 < nums2.length) {
      if(nums1[l1] == nums2[l2]) {
        arr.add(nums1[l1]);
        l1++;
        l2++;
      } else if(nums1[l1] > nums2[l2]){
        l2++;
      } else {
        l1++;
      }

    }

    int size = arr.size();
    int[] rtnArr = new int[size];
    for (int i = 0; i < size; i++) {
      rtnArr[i] = arr.get(i);
    }

    return rtnArr;
  }

}
