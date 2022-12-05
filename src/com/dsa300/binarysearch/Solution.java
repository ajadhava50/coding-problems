package com.dsa300.binarysearch;

class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int result = 0, start = 0, end = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (check(nums, mid, maxOperations)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    private boolean check(int[] nums, int mid, int maxOperations) {
        for (int i = 0; i < nums.length; i++) {
            maxOperations -= (nums[i] / mid);
            if (nums[i] % mid == 0) maxOperations++;
        }
        return maxOperations > 0;
    }
}