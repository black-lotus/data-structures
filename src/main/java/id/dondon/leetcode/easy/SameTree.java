package id.dondon.leetcode.easy;

/**
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 *
 * Detail https://leetcode.com/problems/same-tree/
 * */
public class SameTree {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }

    int pVal = (p != null) ? p.val : -1;
    int qVal = (q != null) ? q.val : -1;
    if (pVal != qVal) {
      return false;
    }

    boolean leftSame = isSameTree((p != null) ? p.left : null, (q != null) ? q.left : null);
    boolean rightSame = isSameTree((p != null) ? p.right: null, (q != null) ? q.right : null);

    return leftSame && rightSame;
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
