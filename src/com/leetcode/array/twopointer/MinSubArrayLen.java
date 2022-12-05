package com.leetcode.array.twopointer;

//209. Minimum Size Subarray Sum
class MinSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int sum = 0, start = 0, end = 0;
        int result = Integer.MAX_VALUE;
        while (end < nums.length) {
            sum += nums[end];
            while (start < nums.length && sum >= target) {
                result = Math.min(result, end - start + 1);
                sum -= nums[start++];
            }
            end++;
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
