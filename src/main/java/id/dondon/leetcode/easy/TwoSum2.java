package id.dondon.leetcode.easy;

/**
 * Given an array of integers numbers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 * Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 *
 * Detail https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * */
public class TwoSum2 {

  public int[] twoSum(int[] numbers, int target) {
    int i = 0;
    int j = numbers.length-1;
    int[] result= new int[2];
    while(i<j){
      int total = numbers[i] + numbers[j];
      if (total == target) {
        result[0]=i+1;
        result[1]=j+1;
        break;
      } else if (total > target) {
        j--;
      } else {
        i++;
      }
    }

    return result;
  }

}
