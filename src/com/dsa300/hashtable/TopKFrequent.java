package com.dsa300.hashtable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.reducing(0, e -> 1, Integer::sum)));

         PriorityQueue<Integer> queue = new PriorityQueue(Comparator.comparingInt(map::get));
        for (Integer num : map.keySet()) {
            queue.add(num);
            if (queue.size() > k)
                queue.poll();
        }
        int result[] = new int[k];
        for (int i = 0; i<k; i++) {
            result[i] = queue.poll();
        }
        return result;
        
    }
}