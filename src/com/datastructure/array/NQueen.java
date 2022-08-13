package com.datastructure.array;

public class NQueen {
    public static boolean nQueen(int board[][], int row) {
        if (row == board.length) return true;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                if (nQueen(board, row + 1)) return true;
                board[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[row][i] != 0) return false;
        }
        for (int i = 0; i < col; i++) {
            if (board[i][col] != 0) return false;
        }
        int boxsqrt = (int) Math.sqrt(board.length);
        int box_rowsqrt = row - row % boxsqrt;
        int box_colsqrt = col - col % boxsqrt;
        for (int i = box_rowsqrt; i < box_rowsqrt + boxsqrt; i++) {
            for (int j = box_colsqrt; j < box_colsqrt + boxsqrt; j++) {
                if (board[i][j] == 1) return false;
            }
            return true;
        }

        // public static void main (String[]args){
//            int board[][] = new int[4][4];
//            nQueen(board, 0);
//
//            for (int i = 0; i < board.length; i++) {
//                for (int j = 0; j < board[0].length; j++) {
//                    System.out.print("\t" + board[i][j]);
//                }
//                System.out.println();
//            }
        // }
        return false;
    }
}
