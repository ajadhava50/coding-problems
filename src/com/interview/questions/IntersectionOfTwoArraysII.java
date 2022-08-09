package com.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//350. Intersection of Two Arrays
class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        //  int result[] = intersect(IntStream.of(1, 2, 2, 1).toArray(), IntStream.of(2, 2).toArray());
        int result[] = intersect(IntStream.of(4, 9, 5).toArray(), IntStream.of(9, 4, 9, 8, 4).toArray());

        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = IntStream.of(nums1).boxed().collect(Collectors.toList());
        Map<Integer, Long> map = list.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Integer> result = new ArrayList<>();
        for (Integer num:nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}