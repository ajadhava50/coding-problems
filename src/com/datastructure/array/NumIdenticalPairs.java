package com.datastructure.array;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

//1512. Number of Good Pairs
class NumIdenticalPairs {
    public static void main(String[] args) {
        numIdenticalPairs(IntStream.of(1, 1, 1, 1).toArray());
    }

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        int result = 0;
        for (int num : nums) {
            int cnt = map.getOrDefault(num, 0);
            result += cnt;
            map.put(num, cnt + 1);
        }
        return result;
    }
}