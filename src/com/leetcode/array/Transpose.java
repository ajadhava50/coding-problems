package com.leetcode.array;

class Transpose {
    public int[][] transpose(int[][] matrix) {
        int transpose[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
}