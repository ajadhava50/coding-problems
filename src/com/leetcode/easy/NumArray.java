package com.leetcode.easy;

class NumArray {
    public int sumArray[];

    public NumArray(int[] nums) {
        sumArray = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sumArray[i] = sum;
        }
    }

    public int sumRange(int left, int right) {
        if (left==0){
            return sumArray[right];
        }
        return sumArray[right] - sumArray[left-1];
    }
}