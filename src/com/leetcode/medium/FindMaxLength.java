package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

//525. Contiguous Array
class FindMaxLength {
    public static void main(String[] args) {
        System.out.println(findMaxLength(IntStream.of(0, 1).toArray()));
    }

    public static int findMaxLength(int[] nums) {
        int ans = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum += -1;
            } else if (nums[i] == 1) {
                sum += 1;
            }
            System.out.println("sum"+sum);
            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                if (len > ans)
                    ans = len;
            } else
                map.put(sum, i);
        }
        return ans;

    }
}