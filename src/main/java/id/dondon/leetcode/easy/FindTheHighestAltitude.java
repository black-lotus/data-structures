package id.dondon.leetcode.easy;

/**
 * Detail https://leetcode.com/problems/find-the-highest-altitude/
 * */
public class FindTheHighestAltitude {

  public int largestAltitude(int[] gain) {
    int largest = 0;
    int step = 0;
    for (int i = 0; i < gain.length; i++) {
      step = gain[i] + step;
      if (step > largest) {
        largest = step;
      }
    }

    return largest;
  }

}
