package com.datastructure.array;

//1480. Running Sum of 1d Array
class RunningSum {
    public static void main(String[] args) {
    }
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;

    }
}