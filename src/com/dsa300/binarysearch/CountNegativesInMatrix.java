package com.dsa300.binarysearch;

//1351. Count Negative Numbers in a Sorted Matrix
class CountNegativesInMatrix {
    public int countNegatives(int[][] grid) {
        int negativeCount = 0;
        int end = grid[0].length - 1;
        for (int i = 0; i < grid.length; i++) {
            negativeCount+= findFirstNegativeIndex(grid, i, 0, end);
        }
        return negativeCount;
    }

    private static int findFirstNegativeIndex(int[][] grid, int row, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (grid[row][mid] < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return grid[row].length - start;
    }
}
