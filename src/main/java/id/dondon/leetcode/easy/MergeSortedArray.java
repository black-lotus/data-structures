package id.dondon.leetcode.easy;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
 *
 * Detail https://leetcode.com/problems/merge-sorted-array/
 * */
public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    if (n == 0) return;
    int c = m + n;

    while(n > 0)
      nums1[--c] = ((m > 0) && (nums2[n-1] <= nums1[m-1])) ? nums1[--m] : nums2[--n];
  }

}
