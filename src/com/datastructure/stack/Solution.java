package com.datastructure.stack;

import java.util.Arrays;
import java.util.Stack;

//85. Maximal Rectangle
class MaximalRectangle {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int next_smaller[] = nextSmaller(heights, n);
        int previous_smaller[] = previousSmaller(heights, n);
        int max_area = 0;
        for (int i = 0; i < n; i++) {
            int current_area = (next_smaller[i] - previous_smaller[i] - 1) * heights[i];
            max_area = Math.max(max_area, current_area);
        }
        return max_area;
    }

    private static int[] previousSmaller(int[] heights, int n) {
        Stack<Integer> stack = new Stack<>();
        //previous_smaller
        int previous_smaller[] = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty())
                previous_smaller[i] = -1;
            else
                previous_smaller[i] = stack.peek();
            stack.push(i);
        }
        return previous_smaller;
    }

    private static int[] nextSmaller(int[] heights, int n) {
        Stack<Integer> stack = new Stack<>();
        int next_smaller[] = new int[n];
        //next_smaller
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty())
                next_smaller[i] = n;
            else
                next_smaller[i] = stack.peek();
            stack.push(i);
        }
        return next_smaller;
    }

    public int maximalRectangle(int[][] matrix) {
        int[] current_row = matrix[0];
        int maxAns = largestRectangleArea(current_row);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    current_row[j] += 0;
                } else
                    current_row[j] = 0;
            }
            int currentAns = largestRectangleArea(current_row);
            maxAns = Math.max(maxAns, currentAns);
        }
        return maxAns;
    }
}