package id.dondon.leetcode;


import java.util.Objects;

/**
 * Given an integer array nums where the elements are sorted in ascending order,
 * convert it to a height-balanced binary search tree.
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
 *
 * Detail https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * */
public class ConvertSortedArrayToBinarySearchTree {

  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums.length == 0) return null;
    return construct(nums, 0, nums.length - 1);
  }

  private TreeNode construct(int[] nums, int left, int right) {
    if (left > right) return null;
    int mid = left + (right - left) / 2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = construct(nums, left, mid - 1);
    node.right = construct(nums, mid + 1, right);

    return node;
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

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      TreeNode treeNode = (TreeNode) o;
      return val == treeNode.val &&
          Objects.equals(left, treeNode.left) &&
          Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
      return Objects.hash(val, left, right);
    }

    @Override
    public String toString() {
      return "TreeNode{" +
          "val=" + val +
          ", left=" + left +
          ", right=" + right +
          '}';
    }
  }

}
