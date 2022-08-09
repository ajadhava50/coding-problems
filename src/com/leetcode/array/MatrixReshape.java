package com.leetcode.array;

//566. Reshape the Matrix
class MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int colomns = mat[0].length;

        if (rows * colomns != r * c) return mat;
        int output_arr[][] = new int[r][c];

        int row_num = 0, col_num = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colomns; j++) {
                output_arr[row_num][col_num] = mat[i][j];
                col_num++;
                if (col_num == c) {
                    row_num++;
                    col_num = 0;
                }
            }
        }
        return output_arr;
    }
}