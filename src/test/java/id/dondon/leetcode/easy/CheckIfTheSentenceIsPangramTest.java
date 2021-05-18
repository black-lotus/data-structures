package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfTheSentenceIsPangramTest {

  @Test
  public void checkIfPangram() {
    CheckIfTheSentenceIsPangram solution = new CheckIfTheSentenceIsPangram();

    Assert.assertTrue(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    Assert.assertFalse(solution.checkIfPangram("leetcode"));
  }
}