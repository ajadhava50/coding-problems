package com.leetcode.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

//1695. Maximum Erasure Value
class MaximumUniqueSubarray {
    public static int maximumUniqueSubarray(int[] nums) {
        int result = 0, sum = 0, start = 0, end = 0;
        Set<Integer> set = new LinkedHashSet<>();
        while (end < nums.length) {
            int num = nums[end++];
            while (start < end && set.contains(num)) {
                set.remove(nums[start]);
                sum -= nums[start++];
            }
            set.add(num);
            sum += num;
            if (sum > result) result = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maximumUniqueSubarray(IntStream.of(5, 2, 1, 2, 5, 2, 1, 2, 5).toArray()));
    }
}