package com.leetcode.array;

import java.util.Arrays;

//LeetCode Find First and Last Position of Element in Sorted Array Solution Explained
public class FirstandLastIndex {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int result[] = searchRange(nums, 8);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);
        return result;
    }

    private static int findStartingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int midPoint = start + (end - start) / 2;
            if (nums[midPoint] >= target) {
                end = midPoint - 1;
            } else {
                start = midPoint + 1;
            }
            if (nums[midPoint] == target) index = midPoint;
        }
        return index;
    }

    private static int findEndingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int midPoint = start + (end - start) / 2;
            if (nums[midPoint] <= target) {
                start = midPoint + 1;
            } else {
                end = midPoint - 1;
            }
            if (nums[midPoint] == target) index = midPoint;
        }
        return index;
    }
}
