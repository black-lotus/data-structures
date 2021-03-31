package id.dondon.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * 1. Each row must contain the digits 1-9 without repetition.
 * 2. Each column must contain the digits 1-9 without repetition.
 * 3. Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 *
 * - A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * - Only the filled cells need to be validated according to the mentioned rules.
 *
 * Detail https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/769/
 * */
public class ValidSudoku {

  private static final char DOT = '.';

  public boolean isValidSudoku(char[][] board) {
    Set<String> seen = new HashSet<String>();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        char c = board[i][j];
        if (c != DOT) {
          if (!seen.add(c + " in row " + i) ||
              !seen.add(c + "in col " + j) ||
              !seen.add(c + "in sub box " + i/3 + "-" + j/3)) return false;
        }
      }
    }

    return true;
  }

}
