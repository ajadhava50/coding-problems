package com.leetcode.array;

import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] result = new int[length];
        if (k > length)
            k = k % length;
        for (int i = 0; i < k; i++) {
            result[i] = nums[length - k + i];
        }
        int j = 0;
        for (int i = k; i < result.length; i++) {
            result[i] = nums[j];
            j++;
        }
        Arrays.stream(nums).forEach(i -> System.out.print(i + ","));
        System.out.println();
        Arrays.stream(result).forEach(i -> System.out.print(i + ","));
        System.arraycopy(result, 0, nums, 0, length);

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        //  Output: [5,6,7,1,2,3,4]
        // rotate(nums,3);
        rotate1(nums, 3);

    }

    private static void rotate1(int[] nums, int k) {

        Arrays.stream(nums).forEach(i -> System.out.print(i + ","));
        k = k % nums.length;
        int firstPart = nums.length - k;
        reverse(nums, 0, firstPart - 1);
        reverse(nums, firstPart, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
        System.out.println();
        Arrays.stream(nums).forEach(i -> System.out.print(i + ","));

    }

    private static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }
    }
}
