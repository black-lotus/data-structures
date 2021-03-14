package id.dondon.leetcode;

import id.dondon.leetcode.MinimumDepthBinaryTree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class MinimumDepthBinaryTreeTest {

  @Test
  public void test() {
    MinimumDepthBinaryTree solution = new MinimumDepthBinaryTree();

    TreeNode left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
    TreeNode right = new TreeNode(2, new TreeNode(4), new TreeNode(3));
    TreeNode tree1 = new TreeNode(1, left, right);
    Assert.assertEquals(3, solution.minDepth(tree1));
  }

}
