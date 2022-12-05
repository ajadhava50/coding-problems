package com.leetcode.array.twopointer;

//count sub array whose sum is lees than k
public class NumSubarraySumLessThanK {

    public int numSubarraySumLessThanK(int nums[], int k) {
        int result = 0;
        int right= 0;
        int left = 0;
        int n = nums.length;
        int currentSum = 0;
        while (right < n) {
            currentSum += nums[right];
            while (left < n && currentSum >= k) {
                currentSum -= nums[left];
                left++;
            }
            result += right - left + 1;
            right++;
        }
        return result;
    }

}
