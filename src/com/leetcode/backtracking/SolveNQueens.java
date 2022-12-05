package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

//51. N-Queens
class SolveNQueens {

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<int[]> quens = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        dfs(board, result, quens, 0);
        return result;
    }

    public void dfs(char[][] board, List<List<String>> result, List<int[]> quens, int row) {
        //check if all queens are placed
        if (quens.size() == board.length) {
            List<String> rows = new ArrayList<>();
            for (char[] r : board) {
                rows.add(new String(r));
            }
            result.add(rows);
        }
        //Try adding queen
        for (int col = 0; col < board.length; col++) {
            if (canAddQueen(quens, row, col)) {
                board[row][col] = 'Q';
                quens.add(new int[] { row, col });
                dfs(board, result, quens, row + 1);
                board[row][col] = '.';
                quens.remove(quens.size() - 1);
            }
        }
    }

    private boolean canAddQueen(List<int[]> quens, int row, int col) {
        for (int[] q : quens) {
            int dx = Math.abs(row - q[0]);
            int dy = Math.abs(col - q[1]);
            if (dx == 0 || dy == 0 || dx == dy) return false;
        }
        return true;
    }
}
