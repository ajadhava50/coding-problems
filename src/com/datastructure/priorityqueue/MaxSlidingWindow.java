package com.datastructure.priorityqueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

//239. Sliding Window Maximum
class MaxSlidingWindow {
    public static void main(String[] args) {
        new MaxSlidingWindow().withPriorityQueue(IntStream.of(1, 3, -1, -3, 5, 3, 6, 7).toArray(), 3);
    }

    public int[] withPriorityQueue(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        PriorityQueue<Integer> queue = new PriorityQueue(Collections.reverseOrder());
        int i = 0;
        for (; i < k; i++) {
            queue.add(nums[i]);
        }
        result[index++] = queue.poll();
        for (; i <= nums.length - k; i++) {
            queue.add(nums[i]);
            result[index++] = queue.poll();
        }
        return result;
    }

    public int[] withDequeue(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        int i = 0;
        for (; i < k; i++) {
            while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
                queue.removeLast();
            }
            queue.addLast(i);
        }
        for (; i <= nums.length - k; i++) {
            result[index++] = nums[queue.peek()];
            while (!queue.isEmpty() && queue.peek() <= i - k) {
                queue.removeFirst();
            }
            while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
                queue.removeLast();
            }
            queue.add(i);
        }
        return result;
    }
}