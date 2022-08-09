package com.leetcode.array;


public class SortColors {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void sortColors(int[] nums) {
        if (nums == null || nums.length == 1) return;
        int start = 0;
        int end = nums.length - 1;
        int index = 0;
        while (index <= end && start < end) {
            if (nums[index] == 0) {
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
            } else if (nums[index] == 2) {
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            } else {
                index++;
            }

        }
    }

}
