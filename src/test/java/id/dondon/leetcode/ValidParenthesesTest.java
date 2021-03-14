package id.dondon.leetcode;

import java.util.Arrays;
import java.util.List;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

  @Test
  public void test() {
    List<Pair<String, Boolean>> cases = Arrays.asList(
        new Pair<>("(((((())))))", true),
        new Pair<>("()()()()", true),
        new Pair<>("(((((((()", false),
        new Pair<>("((()(())))", true),
        new Pair<>("{}", true),
        new Pair<>("[]", true),
        new Pair<>("{]", false)
    );

    ValidParentheses solution = new ValidParentheses();
    for (Pair<String, Boolean> item : cases) {
      Assert.assertEquals(item.getValue(), solution.isValid(item.getKey()));
    }
  }

}
