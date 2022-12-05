package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class FindSubarrays {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> sumSet = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            if (sumSet.contains(nums[i] + nums[i - 1])) {
                return true;
            } else {
                sumSet.add(nums[i] + nums[i - 1]);
            }
        }
        return false;
    }
}