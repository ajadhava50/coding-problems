package com.datastructure.array;

import java.util.ArrayList;
import java.util.List;

class LuckyNumbers {
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
            for (int j = 0; j < row; j++) {
                if (matrix[j][index] > max)
                    max = matrix[j][index];
            }
            if (max == min) result.add(max);
        }
        return result;

    }
}