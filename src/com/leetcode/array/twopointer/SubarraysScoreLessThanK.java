package com.leetcode.array.twopointer;
//2302. Count Subarrays With Score Less Than K
class SubarraysScoreLessThanK {

    public long countSubarrays(int[] nums, long k) {
        int left = 0; long result = 0;
        int right = 0;
        long currentSum = 0;
        int n = nums.length;
        while (right < n) {
            currentSum+=nums[right];
           long score = currentSum * (right - left + 1);
            while (left < n && score >= k) {
                currentSum-=nums[left++];
                score = currentSum * (right - left + 1);
            }
            result += right - left + 1;
            right++;
        }
        return result;
    }
}
