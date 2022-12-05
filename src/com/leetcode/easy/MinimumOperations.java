package com.leetcode.easy;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//2357. Make Array Zero by Subtracting Equal Amounts
class MinimumOperations {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        return set.contains(0) ? set.size() - 1 : set.size();

    }
}