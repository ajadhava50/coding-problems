package com.leetcode.medium;

import java.util.stream.LongStream;

//153. Find Minimum in Rotated Sorted Array
class FindMinimum {

    public static int findMin(int[] nums) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0];

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (nums[left] <= nums[right] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int num[] = {10, 9, 5, 1, 11};
    }
}