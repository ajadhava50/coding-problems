package com.leetcode.array;

class MinPartitions {
    public int minPartitions(String n) {
        int ans = 0;
        for (char ch : n.toCharArray()) {
            int current = ch - 48;
            ans = Math.max(current, ans);
        }
        return ans;

    }
}