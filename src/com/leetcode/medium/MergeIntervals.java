package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class MergeIntervals {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        ArrayList<int[]> output_array = new ArrayList<>();
        int[] current_interval = intervals[0];
        output_array.add(current_interval);
        for (int[] interval : intervals) {
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            if (current_end >= next_begin) {
                current_interval[1] = Math.max(current_end, next_end);
            } else {
                current_interval = interval;
                output_array.add(interval);
            }
        }
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] >= intervals[i + 1][0]) {
                intervals[i][1] = Math.max(intervals[i + 1][1], intervals[i][1]);
                output_array.add(intervals[i]);
                i++;
            } else {
                output_array.add(intervals[i]);
            }
        }

        return output_array.toArray(new int[output_array.size()][]);
    }
}