package com.leetcode.array;

import java.util.stream.IntStream;

//704. Binary Search
class BinarySearch {
    public static void main(String[] args) {
        search(IntStream.of(-1, 0, 3, 5, 9, 12).toArray(), 9);
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}