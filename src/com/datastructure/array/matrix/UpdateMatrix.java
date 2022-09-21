package com.datastructure.array.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//542. 01 Matrix
class UpdateMatrix {
    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> queue = new LinkedList<>();
        int row = mat.length;
        int col = mat.length;
        int result[][] = new int[row][col];
        //Arrays.fill(result, -1);
        for (int[] res: result)
            Arrays.fill(res, -1);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new Pair(i, j));
                    result[i][j] = 0;
                }
            }
        }
        //BFS
        while (!queue.isEmpty()) {
            Pair pair = queue.peek();
            int r = pair.row;
            int c = pair.col;
            if (isValid(r + 1, c, row, col) && result[r + 1][c] == -1) {
                queue.add(new Pair(r + 1, c));
                result[r + 1][c] = result[r + 1][c] + 1;
            }
            if (isValid(r - 1, c, row, col) && result[r - 1][c] == -1) {
                queue.add(new Pair(r - 1, c));
                result[r - 1][c] = result[r - 1][c] + 1;
            }
            if (isValid(r, c + 1, row, col) && result[r][c + 1] == -1) {
                queue.add(new Pair(r, c + 1));
                result[r][c + 1] = result[1][c + 1] + 1;
            }
            if (isValid(r, c - 1, row, col) && result[r][c - 1] == -1) {
                queue.add(new Pair(r, c - 1));
                result[r][c - 1] = result[1][c - 1] + 1;
            }
            queue.poll();
        }
        return result;
    }

    private boolean isValid(int r, int c, int row, int col) {
        return r < 0 || c < 0 || r >= row || c >= col;
    }
}