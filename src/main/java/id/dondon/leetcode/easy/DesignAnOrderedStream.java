package id.dondon.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Detail https://leetcode.com/problems/design-an-ordered-stream/
 * */
public class DesignAnOrderedStream {

  private int ptr;
  private String[] arr;
  public DesignAnOrderedStream(int n) {
    arr = new String[n+1];
    ptr = 1;
  }

  public List<String> insert(int idKey, String value) {
    arr[idKey] = value;
    List<String> str = new ArrayList<>();
    while(ptr < arr.length && arr[ptr] != null )
    {
      str.add(arr[ptr]);
      ptr++;
    }
    return str;
  }

}
