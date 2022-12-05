package com.leetcode.array.twopointer;

//1004. Max Consecutive Ones III
class longestOnes {
    public int longestOnes1(int[] nums, int k) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] == 0) k--;
            if (k < 0) {
                if (nums[j] == 0) {
                    k++;
                }
                j++;
            }
            i++;
        }

        return i - j;

    }

    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int flip = 0;
        int result = 0;
        while (i < nums.length) {
            if (nums[i] == 0) flip++;
            while(flip > k) {
                if (nums[j] == 0) {
                    flip--;
                }
                j++;
            }
            result = Math.max(result, i - j + 1);
            i++;
        }
        return result;

    }
}