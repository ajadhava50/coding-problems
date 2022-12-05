package com.dsa300.dp;

import java.util.stream.IntStream;

//53. Maximum Subarray
class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int result = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result = Math.max(result, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(maxSubArray(IntStream.of(-2, 1, -3, 4, -1, 2, 1, -5, 4).toArray()));
    }
}