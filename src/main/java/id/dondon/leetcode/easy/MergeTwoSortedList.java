package id.dondon.leetcode.easy;

import java.util.Objects;

/**
 * Merge two sorted linked lists and return it as a sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 *
 * Detail https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedList {

  ListNode head = null;
  ListNode tail = null;

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode p1 = l1;
    ListNode p2 = l2;

    while (p1 != null && p2 != null) {
      if (p1.val <= p2.val) {
        insertInList(p1.val);
        p1 = p1.next;
      } else {
        insertInList(p2.val);
        p2 = p2.next;
      }
    }

    while (p2 != null) {
      insertInList(p2.val);
      p2 = p2.next;
    }

    while (p1 != null) {
      insertInList(p1.val);
      p1 = p1.next;
    }

    return head;
  }

  private void insertInList(int toInsert) {
    if (head == null) {
      //list is empty
      head = new ListNode(toInsert);
      tail = head;
    } else {
      ListNode newNode = new ListNode(toInsert);
      tail.next = newNode;
      tail = newNode;
    }
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
