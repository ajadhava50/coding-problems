package com.grind75.week3;

import java.util.ArrayList;
import java.util.List;

//57. Insert Interval
class InsertInterval {
    public static void main(String[] args) {
        InsertInterval interval = new InsertInterval();
        interval.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8});
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        for (int[] current : intervals) {
            if (current[1] < newInterval[0]) {
                result.add(current);
            } else if (newInterval[1] < current[0]) {
                result.add(newInterval);
                newInterval = current;
            } else {
                newInterval[0] = Math.min(newInterval[0], current[0]);
                newInterval[1] = Math.max(newInterval[1], current[1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}