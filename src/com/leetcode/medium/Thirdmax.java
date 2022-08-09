package com.leetcode.medium;

import java.util.PriorityQueue;
import java.util.stream.IntStream;

class Thirdmax {
    public static void main(String[] args) {
        int as = thirdMax(IntStream.of(2, 2, 3, 1).toArray());
        System.out.println("asasdsa" + as);
    }

    public static int thirdMax(int[] nums) {
        int k = 3;
        PriorityQueue<Integer> queue = new PriorityQueue();
        for (Integer num : nums) {
            if (!queue.contains(num)) queue.add(num);
            if (queue.size() > k)
                queue.remove();
        }
        if (queue.size() < k) {
            while (queue.size() > 1) {
                queue.remove();
            }
        }
        return queue.remove();
    }
}