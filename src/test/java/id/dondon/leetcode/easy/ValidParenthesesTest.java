package id.dondon.leetcode.easy;

import id.dondon.leetcode.easy.ValidParentheses;
import java.util.Arrays;
import java.util.List;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

  @Test
  public void test() {
    List<Pair<String, Boolean>> cases = Arrays.asList(
        new Pair<String, Boolean>("(((((())))))", true),
        new Pair<String, Boolean>("()()()()", true),
        new Pair<String, Boolean>("(((((((()", false),
        new Pair<String, Boolean>("((()(())))", true),
        new Pair<String, Boolean>("{}", true),
        new Pair<String, Boolean>("[]", true),
        new Pair<String, Boolean>("{]", false)
    );

    ValidParentheses solution = new ValidParentheses();
    for (Pair<String, Boolean> item : cases) {
      Assert.assertEquals(item.getValue(), solution.isValid(item.getKey()));
    }
  }

}
