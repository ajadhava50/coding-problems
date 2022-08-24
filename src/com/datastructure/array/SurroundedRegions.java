package com.datastructure.array;

//130. Surrounded Regions
class SurroundedRegions {
    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'o') {
                    callBFS(board, i, j);
                }
            }
        }

    }

    private void callBFS(char[][] board, int row, int col) {
        if (row < board.length || col < board[0].length)
            return;

            if (board[row][col] == '0')


                callBFS(board, row + 1, col);
        callBFS(board, row - 1, col);
        callBFS(board, row, col + 1);
        callBFS(board, row, col - 1);
       // board[row][col] == 'o';
    }
}
