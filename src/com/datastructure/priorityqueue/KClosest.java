package com.datastructure.priorityqueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//973. K Closest Points to Origin
class KClosest {
    public int[][] kClosest(int[][] points, int k) {

//        Arrays.sort(points, Comparator.comparing(p -> p[0] * p[0] + p[1] * p[1]));
//        return Arrays.copyOfRange(points, 0, k);

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) ->
                (a[0] * a[0] + b[0] * b[0]) - (a[1] * a[1] + b[1] * b[1]));
        for (int point[] : points) {
            maxHeap.add(point);
            if (maxHeap.size() > k)
                maxHeap.remove();
        }
        int[][] result = new int[k][2];
        while (k > 0) {
            result[k] = maxHeap.remove();
            k--;
        }
        return result;
    }
}