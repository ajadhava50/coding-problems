package com.leetcode.array;

import java.util.Arrays;

//621. Task Scheduler
class LeastInterval {
    public int leastInterval(char[] tasks, int n) {

        int char_map[] = new int[26];
        for (char ch : tasks) {
            char_map[ch - 'A']++;
        }
        Arrays.sort(char_map);
        int max_val = char_map[25] - 1;
        int ideal_slots = n * max_val;
        for (int i = 24; i >= 0; i--) {
            ideal_slots -= Math.min(char_map[i], max_val);
        }
        return ideal_slots > 0 ? ideal_slots + tasks.length : tasks.length;
    }
}