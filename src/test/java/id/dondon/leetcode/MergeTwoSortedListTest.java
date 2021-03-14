package id.dondon.leetcode;

import id.dondon.leetcode.MergeTwoSortedList.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListTest {

  @Test
  public void test() {
    ListNode a = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode b = new ListNode(1, new ListNode(3, new ListNode(4)));

    MergeTwoSortedList solution = new MergeTwoSortedList();
    ListNode result = solution.mergeTwoLists(a, b);
    ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

    Assert.assertEquals(expected, result);
  }

}
