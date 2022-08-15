package com.leetcode.array;

import java.util.Arrays;

class OddCells {
    public int oddCells(int m, int n, int[][] indices) {
        int result[][] = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                result[indices[i][0]][j]++;
            }
            for (int j = 0; j < m; j++) {
                result[j][indices[i][1]]++;
            }
        }
        int cnt = 0;
        for (int res[] : result) {
            for (int val : res) {
                if ((val & 1) != 0)
                    cnt++;
            }
        }
        return cnt;
    }
}