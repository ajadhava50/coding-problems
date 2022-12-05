package com.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;

class EraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int previous = 0;
        int result = 0;
        for (int current = 1; current < intervals.length; current++) {

            if (intervals[current][0] < intervals[previous][1]) {
                result++;
                if (intervals[current][1] <= intervals[previous][1]) {
                    previous = current;
                }
            } else {
                previous = current;
            }

        }
        return result;

    }
}