package com.datastructure.stack;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

//84. Largest Rectangle in Histogram
class LargestRectangleArea {
    public static void main(String[] args) {
        //int num[] = IntStream.of(2, 1, 5, 6, 2, 3).toArray();
        int num[] = IntStream.of(3, 1, 2, 4).toArray();
        LargestRectangleArea largestRectangleArea = new LargestRectangleArea();
        largestRectangleArea.largestRectangleArea(num);
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int next_smaller[] = nextSmaller(heights, n);
        System.out.println();
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
}