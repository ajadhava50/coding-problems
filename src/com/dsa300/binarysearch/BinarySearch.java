package com.dsa300.binarysearch;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class BinarySearch {
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        search(IntStream.of(-1, 0, 3, 5, 9, 12).toArray(), 9);

    }
}