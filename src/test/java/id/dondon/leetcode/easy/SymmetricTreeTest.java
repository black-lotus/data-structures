package id.dondon.leetcode.easy;

import id.dondon.leetcode.easy.SymmetricTree;
import id.dondon.leetcode.easy.SymmetricTree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SymmetricTreeTest {

  @Test
  public void test() {
    SymmetricTree solution = new SymmetricTree();
    TreeNode left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
    TreeNode right = new TreeNode(2, new TreeNode(4), new TreeNode(3));
    TreeNode tree = new TreeNode(1, left, right);
    Assert.assertTrue(solution.isSymmetric(tree));
  }

}
