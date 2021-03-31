package id.dondon.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class ValidSudokuTest {

  @Test
  public void test() {
    ValidSudoku solution = new ValidSudoku();

    char[][] board = new char[9][9];
    board[0] = new char[]{'5','3','.','.','7','.','.','.','.'};
    board[1] = new char[]{'6','.','.','1','9','5','.','.','.'};
    board[2] = new char[]{'.','9','8','.','.','.','.','6','.'};
    board[3] = new char[]{'8','.','.','.','6','.','.','.','3'};
    board[4] = new char[]{'4','.','.','8','.','3','.','.','1'};
    board[5] = new char[]{'7','.','.','.','2','.','.','.','6'};
    board[6] = new char[]{'.','6','.','.','.','.','2','8','.'};
    board[7] = new char[]{'.','.','.','4','1','9','.','.','5'};
    board[8] = new char[]{'.','.','.','.','8','.','.','7','9'};
    Assert.assertTrue(solution.isValidSudoku(board));

    char[][] board2 = new char[9][9];
    board2[0] = new char[]{'8','3','.','.','7','.','.','.','.'};
    board2[1] = new char[]{'6','.','.','1','9','5','.','.','.'};
    board2[2] = new char[]{'.','9','8','.','.','.','.','6','.'};
    board2[3] = new char[]{'8','.','.','.','6','.','.','.','3'};
    board2[4] = new char[]{'4','.','.','8','.','3','.','.','1'};
    board2[5] = new char[]{'7','.','.','.','2','.','.','.','6'};
    board2[6] = new char[]{'.','6','.','.','.','.','2','8','.'};
    board2[7] = new char[]{'.','.','.','4','1','9','.','.','5'};
    board2[8] = new char[]{'.','.','.','.','8','.','.','7','9'};
    Assert.assertFalse(solution.isValidSudoku(board2));
  }

}
