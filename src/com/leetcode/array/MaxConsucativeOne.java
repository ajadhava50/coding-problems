package com.leetcode.array;

public class MaxConsucativeOne {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int maxTillNow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                maxTillNow += 1;
                max = Math.max(max, maxTillNow);
            } else {
                maxTillNow = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        findMaxConsecutiveOnes(nums);

    }
}
