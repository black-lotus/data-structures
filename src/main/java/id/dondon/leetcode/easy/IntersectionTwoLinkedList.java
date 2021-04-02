package id.dondon.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given the heads of two singly linked-lists headA and headB,
 * return the node at which the two lists intersect.
 * If the two linked lists have no intersection at all, return null.
 *
 * Detail https://leetcode.com/problems/intersection-of-two-linked-lists/
 * */
public class IntersectionTwoLinkedList {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode ptr1 = headA;
    ListNode ptr2 = headB;
    Set set = new HashSet<>();

    while(ptr1 != null){
      set.add(ptr1);
      ptr1 = ptr1.next;
    }

    while(ptr2 != null)
    {
      if(set.contains(ptr2)) return ptr2;
      set.add(ptr2);
      ptr2 = ptr2.next;
    }
    return null;
  }

  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
  }

}
