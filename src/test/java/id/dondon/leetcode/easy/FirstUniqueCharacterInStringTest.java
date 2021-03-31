package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharacterInStringTest {

  @Test
  public void test() {
    FirstUniqueCharacterInString solution = new FirstUniqueCharacterInString();

    Assert.assertEquals(0, solution.firstUniqChar("leetcode"));
    Assert.assertEquals(2, solution.firstUniqChar("loveleetcode"));
    Assert.assertEquals(-1, solution.firstUniqChar("aabb"));
  }

}
