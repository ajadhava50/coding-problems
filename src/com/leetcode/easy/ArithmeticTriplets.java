package com.leetcode.easy;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//2367. Number of Arithmetic Triplets
class ArithmeticTriplets {


    public int arithmeticTriplets(int[] nums, int diff) {
        if (nums == null || nums.length < 3) return -1;
        int count = 0;
        Set<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        for (int i = nums.length - 1; i >= 0; i--) {
            if (set.contains(nums[i] - diff)) {
                int secondNum = nums[i] - diff;
                if (set.contains(secondNum - diff)) {
                    count++;
                }
            }
        }
        return count;

    }
}