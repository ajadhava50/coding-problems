package com.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class TwoSum {
    public static void main(String[] args) {
        twoSum(IntStream.of(2, 7, 11, 15).toArray(), 9);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                result[0] = i;
                result[1] = map.get(diff);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}