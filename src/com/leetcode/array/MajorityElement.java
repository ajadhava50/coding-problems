package com.leetcode.array;

import java.util.stream.IntStream;

//169. Majority Element
class MajorityElement {
    public static void main(String[] args) {
        majorityElement(IntStream.of(3, 2, 3).toArray());
    }

    public static int majorityElement(int[] nums) {

//        Map<Integer, Integer> map = new HashMap<>();
//        int result = 0;
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//            if (map.get(num) > nums.length / 2)
//                     result = num;
//        }
//        map.forEach((k,v)-> System.out.println(k+"::"+v));
//        return result;

        int candidate = Integer.MIN_VALUE;
        int life = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate) {
                life++;
            } else if (life == 0) {
                candidate = nums[i];
                life = 1;
            } else life--;
        }
        return candidate;
    }
}