package id.dondon.leetcode.easy;

/**
 * Given two integer arrays startTime and endTime and given an integer queryTime.
 * The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].
 * Return the number of students doing their homework at time queryTime. More formally,
 * return the number of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.
 *
 * Detail https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
 * */
public class NumberOfStudentsDoingHomeworkAtAGivenTime {

  public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
    int total = 0;

    for (int i = 0; i < startTime.length; i++) {
      int start = startTime[i];
      int end = endTime[i];
      if (start <= queryTime && end >= queryTime) {
        total += 1;
      }
    }

    return total;
  }

}
