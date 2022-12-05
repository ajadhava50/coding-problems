package com.leetcode.bitmanipulation;

//260. Single Number III
class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        ans = ans & ~(ans - 1);
        int set1 = 0, set2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((ans & nums[i]) == 0)
                set1 ^= nums[i];
            else
                set2 ^= nums[i];
        }
        return new int[]{set1, set2};
    }
}