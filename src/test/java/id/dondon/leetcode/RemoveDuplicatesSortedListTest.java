package id.dondon.leetcode;

import id.dondon.leetcode.RemoveDuplicatesSortedList.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesSortedListTest {

  @Test
  public void test() {
    ListNode a = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(3))))));

    RemoveDuplicatesSortedList solution = new RemoveDuplicatesSortedList();
    ListNode result = solution.deleteDuplicates(a);
    ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3)));

    Assert.assertEquals(expected, result);
  }

}
