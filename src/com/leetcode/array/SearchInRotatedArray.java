package com.leetcode.array;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {1};
        search(nums, 0);
    }

    private static int search1(int[] nums, int target) {
return 0;
}

    private static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid;
        }
        int start = left;
        left = 0;
        right = nums.length - 1;
        if (target >= nums[start] && target <= nums[right])
            left = start;
        else
            right = start;
        while (left <= start) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;

        }
        return -1;
    }
}
