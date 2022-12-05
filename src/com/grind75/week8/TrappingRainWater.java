package com.grind75.week8;

import java.util.Arrays;

class TrappingRainWater {
    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(nums));
    }

    public static int trap(int[] height) {
        int result = 0;
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        for (int i = 0; i < n; i++) {
            result += Math.min(left[i], right[i]) - height[i];
        }
        return result;
    }
}