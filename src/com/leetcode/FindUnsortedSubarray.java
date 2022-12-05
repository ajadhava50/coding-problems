package com.leetcode;

import java.util.stream.IntStream;

class FindUnsortedSubarray {
    public static void main(String[] args) {
        findUnsortedSubarray(IntStream.of(2,6,4,8,10,9,15).toArray());
    }
    public static int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1])
                min = Math.min(min, nums[i]);
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                max = Math.max(max, nums[i]);
            }
        }
        int l = 0, r = nums.length - 1;
        for (; l < nums.length - 1; l++) {
            if (min < nums[l]) break;
        }
        System.out.println("l::"+l+"::"+min);
        for (; r >= 0; r--) {
            if (max > nums[r]) break;
        }
        System.out.println("r::"+r+"::"+max);

        return r - l < 0 ? 0 : r - l + 1;
    }
}