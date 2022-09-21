package com.grind75.week6;

import java.util.ArrayList;
import java.util.List;

class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        int size = matrix.length * matrix[0].length;
        while (size > result.size()) {
            for (int i = colBegin; i <= colEnd && result.size() < size; i++) {
                result.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd && result.size() < size; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;
            for (int i = colEnd; i >= colBegin && result.size() < size; i--) {
                result.add(matrix[rowEnd][i]);
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowBegin && result.size() < size; i--) {
                result.add(matrix[i][colBegin]);
            }
            colBegin++;
        }
        return result;
    }
}