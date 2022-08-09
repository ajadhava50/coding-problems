package com.leetcode.array;

class MinCostClimbingStairs {
    public static void main(String[] args) {
        int costs[] = {10, 15, 20};
       int cnt= minCostClimbingStairs(costs);
        System.out.println(cnt);
    }

    public static int minCostClimbingStairs(int[] costs) {
        int step1 = 0;
        int step2 = 0;
        int totalCost = 0;
        for (int cost : costs) {
            totalCost = cost + Math.min(step1, step2);
            step1 = step2;
            step2 = totalCost;
        }
       return Math.min(step1,step2);
    }
}