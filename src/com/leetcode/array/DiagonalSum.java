package com.leetcode.array;

class DiagonalSum {
    int mat[][] = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};

    public int diagonalSum(int mat[][]) {

        int diagonalSum = 0;
        int n = mat.length;
        for (int i = 0; i < mat.length; i++) {
            diagonalSum += mat[i][i];
            diagonalSum += mat[n - 1 - i][i];
        }
        return n % 2 == 0 ? diagonalSum : diagonalSum - mat[n/2][n/2];
    }
}