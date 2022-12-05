package com.grind75.week8;

import java.util.Stack;

//84. Largest Rectangle in Histogram
class LargestRectangleArea {
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
        int previousSmaller[] = new int[heights.length];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                previousSmaller[i] = -1;
            } else {
                previousSmaller[i] = stack.peek();
            }
            stack.push(i);
        }
        return previousSmaller;

    }
    private static int[] nextSmaller(int[] heights, int n) {
        Stack<Integer> stack = new Stack<>();
        int nextSmaller[] = new int[heights.length];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextSmaller[i] = n;
            } else {
                nextSmaller[i] = stack.peek();
            }
            stack.push(i);
        }
        return nextSmaller;

    }
}