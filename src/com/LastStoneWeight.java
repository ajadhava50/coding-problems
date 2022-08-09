package com;

import java.util.Collections;
import java.util.PriorityQueue;

//1046. Last Stone Weight
class LastStoneWeight {
    public static void main(String[] args) {

    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            pq.add(stone);
        }
        while (pq.size() > 1) {
            pq.add(pq.poll() - pq.poll());
        }
        return pq.peek();
    }
}