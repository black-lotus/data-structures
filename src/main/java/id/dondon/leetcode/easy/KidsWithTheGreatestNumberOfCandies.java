package id.dondon.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Given the array candies and the integer extraCandies,
 * where candies[i] represents the number of candies that the ith kid has.
 *
 * For each kid check if there is a way to distribute extraCandies among the kids
 * such that he or she can have the greatest number of candies among them.
 * Notice that multiple kids can have the greatest number of candies.
 *
 * Detail https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * */
public class KidsWithTheGreatestNumberOfCandies {

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int greatest = 0;
    for (int i = 0; i < candies.length; i++) {
      if (candies[i] > greatest) {
        greatest = candies[i];
      }
    }

    List<Boolean> result = new LinkedList<>();
    for (int i = 0; i < candies.length; i++) {
      int val = candies[i] + extraCandies;
      if (val >= greatest) {
        result.add(true);
      } else {
        result.add(false);
      }
    }

    return result;
  }

}
