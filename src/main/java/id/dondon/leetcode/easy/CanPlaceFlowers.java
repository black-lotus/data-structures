package id.dondon.leetcode.easy;

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not.
 * However, flowers cannot be planted in adjacent plots.
 *
 * Given an integer array flowerbed containing 0's and 1's,
 * where 0 means empty and 1 means not empty, and an integer n,
 * return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
 *
 * Detail https://leetcode.com/problems/can-place-flowers/
 * */
public class CanPlaceFlowers {

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if (n > flowerbed.length) {
      return false;
    }
    for (int i = 0; i < flowerbed.length; i++) {
      if (n <= 0) {
        return true;
      }

      if (flowerbed[i] == 1) {
        continue;
      }

      if (i - 1 >= 0 && flowerbed[i - 1] == 1) {
        continue;
      }

      if (i + 1 < flowerbed.length && flowerbed[i + 1] == 1) {
        continue;
      }

      flowerbed[i] = 1; // plant it!
      i++; // no need to check next position
      n--; // reduce number of flowers
    }
    return n <= 0;
  }

}
