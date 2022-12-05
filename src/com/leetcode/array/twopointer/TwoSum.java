package com.leetcode.array.twopointer;

public class TwoSum {
    public static int[] twoSum1(int[] nums, int target) {
        //time complexity o(n)
        //space complexity o(1)
        int result[] = new int[2];
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum > target) end--;
            else if (sum < target) {
                start++;
            } else {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            }
        }
        return result;
    }
}
