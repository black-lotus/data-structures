package id.dondon.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses {

  private static final Map<Character, Character> matchingParenMap = new HashMap<Character, Character>();
  private static final Set<Character> openingParenSet = new HashSet<Character>();

  public ValidParentheses() {
    matchingParenMap.put(')', '(');
    matchingParenMap.put(']', '[');
    matchingParenMap.put('}', '{');
    openingParenSet.addAll(matchingParenMap.values());
  }


  public boolean isValid(String s) {
    try {
      Stack<Character> parenStack = new Stack<Character>();
      for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        // Add to the stack for an opening paren.
        if (openingParenSet.contains(ch)) {
          parenStack.push(ch);
        }
        if (matchingParenMap.containsKey(ch)) {
          Character lastParen = parenStack.pop();
          if (lastParen != matchingParenMap.get(ch)) {
            return false;
          }
        }
      }

      return parenStack.isEmpty();
    } catch (Exception soe) {
      System.err.println("Stack Overflow");
    }

    return false;
  }
}
