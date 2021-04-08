package id.dondon.leetcode.easy;

import java.util.List;

/**
 * You are given an array items,
 * where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item.
 * You are also given a rule represented by two strings, ruleKey and ruleValue.
 *
 * The ith item is said to match the rule if one of the following is true:
 *
 * ruleKey == "type" and ruleValue == typei.
 * ruleKey == "color" and ruleValue == colori.
 * ruleKey == "name" and ruleValue == namei.
 * Return the number of items that match the given rule.
 *
 * Detail https://leetcode.com/problems/count-items-matching-a-rule/
 * */
public class CountItemsMatchingARule {

  private static final String TYPE = "type";
  private static final String COLOR = "color";
  private static final String NAME = "name";

  public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int total = 0;
    for (int i = 0; i < items.size(); i++) {
      String type = items.get(i).get(0);
      String color = items.get(i).get(1);
      String name = items.get(i).get(2);

      if (ruleKey.equals(TYPE) && ruleValue.equals(type)) {
        total += 1;
      } else if (ruleKey.equals(COLOR) && ruleValue.equals(color)) {
        total += 1;
      } else if (ruleKey.equals(NAME) && ruleValue.equals(name)) {
        total += 1;
      }
    }
    return total;
  }

}
