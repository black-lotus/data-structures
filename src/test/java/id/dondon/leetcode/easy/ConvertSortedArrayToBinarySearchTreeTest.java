package id.dondon.leetcode.easy;

import id.dondon.leetcode.easy.ConvertSortedArrayToBinarySearchTree;
import id.dondon.leetcode.easy.ConvertSortedArrayToBinarySearchTree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ConvertSortedArrayToBinarySearchTreeTest {

  @Test
  public void test() {
    ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();

    int[] input = new int[]{-10, -5, -3, 0, 5, 8, 9};
    TreeNode result = solution.sortedArrayToBST(input);

    TreeNode left = new TreeNode(-5, new TreeNode(-10), new TreeNode(-3));
    TreeNode right = new TreeNode(8, new TreeNode(5), new TreeNode(9));
    TreeNode expected = new TreeNode(0, left, right);

    Assert.assertEquals(expected, result);
  }

}
