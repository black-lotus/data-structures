package id.dondon.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Detail https://leetcode.com/problems/create-target-array-in-the-given-order/
 * */
public class CreateTargetArrayInTheGivenOrder {

  public int[] createTargetArray(int[] nums, int[] index) {
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i<index.length; i++) {
      list.add(index[i],nums[i]);
    }

    int[] target = new int[index.length];
    for(int i = 0; i< list.size(); i++) {
      target[i] = list.get(i);
    }
    return target;
  }

}
