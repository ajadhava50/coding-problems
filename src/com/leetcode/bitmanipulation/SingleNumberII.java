package com.leetcode.bitmanipulation;

//137. Single Number II
class SingleNumberII {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int countOdd = 0;
            int countEven = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((i << 1) & nums[i]) == 0) {
                    countEven++;
                } else
                    countOdd++;
            }
            if (countOdd % 3 != 0) {
                ans = ans | (i << 1);
            }
        }
        return ans;

    }
}