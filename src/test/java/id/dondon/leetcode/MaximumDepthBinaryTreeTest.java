package id.dondon.leetcode;

import id.dondon.leetcode.MaximumDepthBinaryTree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class MaximumDepthBinaryTreeTest {

  @Test
  public void test() {
    MaximumDepthBinaryTree solution = new MaximumDepthBinaryTree();

    TreeNode left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
    TreeNode right = new TreeNode(2, new TreeNode(4), new TreeNode(3));
    TreeNode tree1 = new TreeNode(1, left, right);
    Assert.assertEquals(3, solution.maxDepth(tree1));

    TreeNode tree2 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), null);
    Assert.assertEquals(3, solution.maxDepth(tree2));

    Assert.assertEquals(0, solution.maxDepth(null));
  }

}
