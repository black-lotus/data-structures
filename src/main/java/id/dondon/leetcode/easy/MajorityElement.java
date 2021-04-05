package id.dondon.leetcode.easy;

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 * Detail https://leetcode.com/problems/majority-element/
 * */
public class MajorityElement {

  public int majorityElement(int[] nums) {
    int maj=nums[0],freq=1;

    for(int i=1;i<nums.length;i++){

      if(nums[i]==maj)
        ++freq;
      else{
        --freq;
        if(freq==0){
          maj=nums[i];
          ++freq;
        }
      }
    }


    return maj;
  }

}
