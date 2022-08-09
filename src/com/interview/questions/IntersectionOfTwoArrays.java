package com.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//349. Intersection of Two Arrays
class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int result[] = intersect(IntStream.of(1, 2, 2, 1).toArray(), IntStream.of(2, 2).toArray());
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toUnmodifiableSet());
        List<Integer> intersectionSet = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }
        int result[] = new int[intersectionSet.size()];
        int index = 0;
        for (Integer in : intersectionSet) {
            result[index] = in;
            index++;
        }
        return result;
    }
}