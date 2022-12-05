package com.leetcode.bitmanipulation;

class MissingNumberWithBits {
    public int missingNumberWithBits(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans^= (nums[i] ^ i);
        }
        return ans;

    }

    public int missingNumber(int[] nums) {
        int expectedLength = nums.length + 1;
        int expectedSum = (expectedLength * (expectedLength - 1)) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}