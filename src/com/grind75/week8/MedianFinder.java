package com.grind75.week8;

import java.util.Collections;
import java.util.PriorityQueue;

//295. Find Median from Data Stream
class MedianFinder {
    private final PriorityQueue<Integer> maxHeap;
    private final PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        this.maxHeap = new PriorityQueue(Collections.reverseOrder());
        this.minHeap = new PriorityQueue();

    }

    public void addNum(int num) {

        if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }
        //make sure maxHeap and MinHeap size difference should not more than one
        //maxHeap size = minHeap size or minHeap Size +1
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) return maxHeap.poll() / 2.0 + minHeap.poll() / 2.0;
        return maxHeap.poll();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */