package com.leetcode.array;
//1217. Minimum Cost to Move Chips to The Same Position
class MinCostToMoveChips {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for (int val : position) {
            if ((val & 1) == 0) even++;
            else odd++;
        }
        if (even == position.length || odd == position.length) return 0;
        return Math.min(even, odd);
    }
}