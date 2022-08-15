package com.datastructure.array;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

//560. Subarray Sum Equals K
class SubarraySum {
    public static void main(String[] args) {
        subarraySum(IntStream.of(1, 2, 3).toArray(), 3);
    }

    public static int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int result = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k))
                result += map.get(sum - k);
            map.putIfAbsent(sum, map.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}