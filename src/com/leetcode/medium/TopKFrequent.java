package com.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class TopKFrequent {
    public static void main(String[] args) {
        topKFrequent(IntStream.of(1, 1, 1, 2, 2, 3).toArray(), 2);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.reducing(0, e -> 1, Integer::sum)));
        map.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .limit(k).map(m->m.getValue()).forEach(System.out::println);
        System.out.println();
        PriorityQueue<Integer> queue = new PriorityQueue(Comparator.comparingInt(map::get));
        for (Integer num : map.keySet()) {
            queue.add(num);
            if (queue.size() > k)
                queue.poll();
        }
        int result[] = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = queue.poll();
        }
        return result;
    }

}