package id.dondon.leetcode.easy;

/**
 * Given the root of a binary tree,
 * check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 * Detail https://leetcode.com/problems/symmetric-tree/
 * */
public class SymmetricTree {

  public boolean isSymmetric(TreeNode root) {
    return isSymmetric(root.left, root.right);
  }

  private boolean isSymmetric(TreeNode left, TreeNode right) {
    if (left == null && right == null) return true;
    if (left == null || right == null) return false;

    if (left.val == right.val) {
      return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    return false;
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
