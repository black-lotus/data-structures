package id.dondon.leetcode.easy;

import java.util.Objects;

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 *
 * Detail https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * */
public class RemoveDuplicatesSortedList {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode h = null;
    ListNode t = null;

    int prev = 0;
    while (head != null) {
      if (h == null) {
        h = new ListNode(head.val);
        t = h;
        prev = head.val;
      } else {
        if (head.val != prev) {
          ListNode newNode = new ListNode(head.val);
          t.next = newNode;
          t = newNode;
          prev = head.val;
        }
      }
      head = head.next;
    }

    return h;
  }

  public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
      return "ListNode{" +
          "val=" + val +
          ", next=" + next +
          '}';
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      ListNode listNode = (ListNode) o;
      return val == listNode.val &&
          Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
      return Objects.hash(val, next);
    }
  }

}
