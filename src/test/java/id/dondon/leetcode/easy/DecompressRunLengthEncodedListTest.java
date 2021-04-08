package id.dondon.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class DecompressRunLengthEncodedListTest {

  @Test
  public void test() {
    DecompressRunLengthEncodedList solution = new DecompressRunLengthEncodedList();

    Assert.assertArrayEquals(new int[]{1,3,3}, solution.decompressRLElist(new int[]{1,1,2,3}));
  }

}
