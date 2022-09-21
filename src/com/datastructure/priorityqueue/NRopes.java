package com.datastructure.priorityqueue;

import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class NRopes {

    public static int connectRope(int ropes[]) {
        int cost = 0;
        PriorityQueue<Integer> queue = new PriorityQueue();
        for (int rope : ropes) {
            queue.add(rope);
        }
        while (queue.size() > 1) {
            int firstSmallRope = queue.poll();
            int secondSmallRope = queue.poll();
            int newRope = firstSmallRope + secondSmallRope;
            queue.add(newRope);
            cost += newRope;
        }
        return cost;
    }

    public static void main(String[] args) {

        int cost=connectRope(IntStream.of(4, 3, 2, 6).toArray());
        System.out.println("cost:"+cost);
    }
}
