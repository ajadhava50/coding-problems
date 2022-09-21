package com.datastructure.array;

import java.util.ArrayList;
import java.util.List;

class LuckyNumbers {
    public static void main(String[] args) {
        LuckyNumbers lc = new LuckyNumbers();
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        lc.luckyNumbers(matrix);
    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            int index = -1;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    index = j;
                }
            }
            int max = Integer.MIN_VALUE;
            for (int k = 0; k < row; k++) {
                if (matrix[k][index] > max)
                    max = matrix[k][index];
            }
            if (max == min) result.add(max);
        }
        System.out.println(result);
        return result;
    }
}