package id.dondon.leetcode.medium;

/**
 * The count-and-say sequence is a sequence of digit Strings defined by the recursive formula:
 *
 * countAndSay(1) = "1"
 * countAndSay(n) is the way you would "say" the digit String from countAndSay(n-1), which is then converted into a different digit String.
 * To determine how you "say" a digit String, split it into the minimal number of groups so that each group is a contiguous section all of the same character. Then for each group, say the number of characters, then say the character. To convert the saying into a digit String, replace the counts with a number and concatenate every saying.
 *
 * For example, the saying and conversion for digit String "3322251":
 * Given a positive integer n, return the nth term of the count-and-say sequence.
 *
 * Detail https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/Strings/886/
 * */
public class CountAndSay {

  public String countAndSay(int n) {
    String lastSay = "1";
    for(int i=1; i<n; i++) {
      lastSay = say(lastSay);
    }

    return lastSay;
  }

  private String say(String n) {
    if (n.isEmpty())
      return "";

    if (n.length() == 1)
      return "1" + n;

    StringBuilder result = new StringBuilder();
    char lastSymbol = n.charAt(0);
    int count = 1;
    for(int i=1; i<n.length(); i++) {
      if(n.charAt(i) == lastSymbol) {
        count++;
      } else {
        result.append(count).append(lastSymbol);
        count = 1;
        lastSymbol = n.charAt(i);
      }
    }

    result.append(count).append(lastSymbol);
    return result.toString();
  }

}
