package com.datastructure.array;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

//169. Majority Element
class MajorityElement {
    public static void main(String[] args) {
        majorityElement(IntStream.of(3, 2, 3).toArray());
    }

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 2)
                     result = num;
        }
        map.forEach((k,v)-> System.out.println(k+"::"+v));
        return result;
    }
}