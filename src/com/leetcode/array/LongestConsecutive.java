package com.leetcode.array;

import java.util.HashSet;
import java.util.Set;

class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int previous = current - 1;
            int count = 0;
            if (set.contains(previous)) {
                while (set.contains(current)) {
                    current++;
                    count++;
                }
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}