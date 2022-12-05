package com.grind75.week7;
//11. Container With Most Water
class MaxArea {
    public int maxArea(int[] height) {
        int max_area = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            if (height[left] < height[right]) {
                max_area = Math.max(max_area, height[left] * (right - left));
                left++;
            } else {
                max_area = Math.max(max_area, height[right] * (right - left));
                right--;
            }

        }
        return max_area;

    }

    public int trappingWater(int height[]) {
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
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(left[i], right[i]) - height[i];
        }
        return ans;
    }
}