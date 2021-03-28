package id.dondon.leetcode.easy;

import id.dondon.leetcode.easy.BalancedBinaryTree;
import id.dondon.leetcode.easy.BalancedBinaryTree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BalancedBinaryTreeTest {

  @Test
  public void test() {
    BalancedBinaryTree solution = new BalancedBinaryTree();

    TreeNode left = new TreeNode(9);
    TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
    TreeNode tree = new TreeNode(3, left, right);

    Assert.assertTrue(solution.isBalanced(tree));
  }

}
