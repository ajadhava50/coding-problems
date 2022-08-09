package com.leetcode.medium;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

//451. Sort Characters By Frequency
class FrequencySort {
    public static void main(String[] args) {
        frequencySort("tree");
    }

    public static String frequencySort(String s) {
        Map<Character, Long> map = s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> (int) (map.get(b) - map.get(a)));
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.remove();
            for (int i = 0; i < map.get(current); i++) {
                result.append(current);
            }
        }
        return result.toString();
    }
}