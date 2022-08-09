package com.interview.questions;

import java.util.HashSet;
import java.util.Set;

class ValidSudoku {
    public static void main(String[] args) {
        String[][] board = {
                {"5", "3", ".", ".", "7", ".", ".", ".", "."}
                , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
                , {".", "9", "8", ".", ".", ".", ".", "6", "."}
                , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
                , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
                , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
                , {".", "6", ".", ".", ".", ".", "2", "8", "."}
                , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
                , {".", ".", ".", ".", "8", ".", ".", "7", "9"}

        };
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current_val = board[i][j];
                if (current_val != '.') {
                    if (!set.add(current_val + " found in row " + i) ||
                            !set.add(current_val + " found in column " + j) ||
                            !set.add(current_val + " found in sub box " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}