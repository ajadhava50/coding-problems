package com.leetcode.array;

//42. Trapping Rain Water
class Trap {


    public int trap1(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1; // Pointers to both ends of the array.
        int maxLeft = 0;
        int maxRight = 0;

        int totalWater = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] <= maxLeft) {
                    maxLeft = height[left];
                } else {
                    totalWater += maxLeft - height[left];
                }
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    totalWater += maxRight - height[right];
                }
                right--;
            }
        }
        return totalWater;
    }

    public int trap(int[] height) {
        int totalTrap = 0;
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = height[0];
        for (int i = 1; i < n - 1; i++) {
            left[i] = Math.max(left[i - 1], height[i + 1]);
        }
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(height[i + 1], right[i]);
        }
        for (int i = 0; i < n; i++) {
            totalTrap += Math.min(left[i], right[i]) - height[i];
        }

        return totalTrap;

    }
}