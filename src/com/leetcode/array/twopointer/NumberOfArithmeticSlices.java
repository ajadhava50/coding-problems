package com.leetcode.array.twopointer;

//413. Arithmetic Slices
class NumberOfArithmeticSlices {
    //1,2,3,4
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;
        int start = 0, end = 1, n = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int diff = nums[end] - nums[start];
            while (end < nums.length && nums[i + 1] - nums[i] == diff) {
                end++;
                i++;
            }
            n = end - start + 1;
            if (n >= 3)
                sum = (n - 2) * (n + 1) / 2;
            start = end;

        }
        return sum;
    }
}