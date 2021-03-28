package id.dondon.leetcode.easy;

/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as:
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 *
 * Detail https://leetcode.com/problems/balanced-binary-tree/
 * */
public class BalancedBinaryTree {

  public boolean isBalanced(TreeNode root) {
    if (root == null) return true;
    if (root.left == null && root.right == null) return true;

    if (!isBalanced(root.left) || !isBalanced(root.right)) return false;

    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    int sub = leftHeight - rightHeight;
    if (sub < 0) {
      sub *= -1;
    }

    return !(sub > 1);
  }

  private int height(TreeNode node) {
    if (node == null) return 0;
    int leftHeight = height(node.left);
    int rightHeight = height(node.right);
    return Math.max(leftHeight, rightHeight) + 1;
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
