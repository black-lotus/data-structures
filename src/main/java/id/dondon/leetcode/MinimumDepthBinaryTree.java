package id.dondon.leetcode;

/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * Note: A leaf is a node with no children.
 *
 * Detail https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * */
public class MinimumDepthBinaryTree {

  public int minDepth(TreeNode root) {
    if (root == null) return 0;
    if (root.left == null || root.right == null) {
      return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
    }

    return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
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
