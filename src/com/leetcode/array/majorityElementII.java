package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class majorityElementII {
    public static List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        Integer candidate1 = Integer.MIN_VALUE;
        Integer candidate2 = Integer.MIN_VALUE;
        Integer life1 = 0;
        Integer life2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == candidate1) {
                life1++;
            } else if (nums[i] == candidate2) {
                life2++;
            } else if (life1 == 0) {
                candidate1 = nums[i];
                life1 = 1;
            } else if (life2 == 0) {
                candidate2 = nums[i];
                life2 = 1;
            } else {
                life1--;
                life2--;
            }
        }
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == candidate1) count1++;
            if (nums[i] == candidate2) count2++;
        }
        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);
        return result;
    }

    public static void main(String[] args) {
        majorityElement(IntStream.of(3, 2, 3).toArray());
    }
}