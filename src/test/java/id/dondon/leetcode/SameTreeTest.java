package id.dondon.leetcode;

import id.dondon.leetcode.SameTree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SameTreeTest {

  @Test
  public void test() {
    SameTree solution = new SameTree();

    TreeNode treeA1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    TreeNode treeB1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    boolean result1 = solution.isSameTree(treeA1, treeB1);
    Assert.assertTrue(result1);

    TreeNode treeA2 = new TreeNode(0);
    TreeNode treeB2 = null;
    boolean result2 = solution.isSameTree(treeA2, treeB2);
    Assert.assertFalse(result2);
  }

}
