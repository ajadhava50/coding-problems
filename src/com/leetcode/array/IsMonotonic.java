package com.leetcode.array;

import java.util.stream.IntStream;

//896. Monotonic Array
class IsMonotonic {
    public static void main(String[] args) {
        isMonotonic(IntStream.of(1, 2, 2, 3).toArray());
    }

    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[i + 1]) increasing = false;
            if (nums[i] < nums[i + 1]) decreasing = false;
        }
        return increasing || decreasing;
    }
}