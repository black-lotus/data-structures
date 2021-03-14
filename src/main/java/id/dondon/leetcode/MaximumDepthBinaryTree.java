package id.dondon.leetcode;

/**
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Detail https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * */
public class MaximumDepthBinaryTree {

  public int maxDepth(TreeNode root) {
    if (root == null) return 0;

    int leftDepth = maxDepth(root.left, 1);
    int rightDepth = maxDepth(root.right, 1);

    if (leftDepth >= rightDepth) {
      return leftDepth;
    }

    return rightDepth;
  }

  private int maxDepth(TreeNode node, int depth) {
    if (node == null) return depth;

    int leftDepth = maxDepth(node.left, depth + 1);
    int rightDepth = maxDepth(node.right, depth + 1);
    if (leftDepth >= rightDepth) {
      return leftDepth;
    }

    return rightDepth;
  }

  public  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

}
