package com.leetcode.array;
//1732 Find the highest altitude
class largestAltitude {
    public int largestAltitude(int[] gains) {
        int cur_alt = 0;
        int max_alt = 0;
        for (int gain : gains) {
            cur_alt += gain;
            max_alt = Math.max(cur_alt, max_alt);
        }
        return max_alt;

    }
}