package id.dondon.leetcode.easy;

/**
 * Detail https://leetcode.com/problems/minimum-time-visiting-all-points/
 * */
public class MinimumTimeVisitingAllPoints {

  public int minTimeToVisitAllPoints(int[][] points) {
    int distance = 0;

    for (int i = 0; i < points.length - 1; i++) {
      int x = points[i][0];
      int y = points[i][1];

      int targetX = points[i + 1][0];
      int targetY = points[i + 1][1];

      distance += Math.max(Math.abs(x-targetX),Math.abs(y-targetY));
    }

    return distance;
  }

}
