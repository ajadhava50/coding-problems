package com.leetcode.array;

class LongestMountain {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 1; i < n - 2; ) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int count = 1;
                int j = i;
                while (j > 0 && arr[j] > arr[j - 1]) {
                    j--;
                    count++;
                }
                while (i < n - 1 && arr[i] > arr[i + 1]) {
                    count++;
                    i++;
                }
                ans = Math.max(count, ans);
            } else i++;
        }
        return ans;
    }
}