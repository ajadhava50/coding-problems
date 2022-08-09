package com.leetcode.array;

import java.util.stream.IntStream;

//724. Find Pivot Index
class FindPivotIndex {
    public static void main(String[] args) {
        int nums[] = {1, 7, 3, 6, 5, 6};
        pivotIndex(nums);
    }

    public static int pivotIndex(int[] nums) {
        int total_sum = IntStream.of(nums).sum();
        int left_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) left_sum = nums[i-1];
            if (total_sum - left_sum + nums[i] == left_sum)
                return i;
        }
        return -1;
    }
}