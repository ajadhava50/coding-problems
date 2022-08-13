package com.corejava.string;

class Solution {
    public int maxProfit(int[] prices) {
        int min_till_now = Integer.MAX_VALUE, max_profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            min_till_now = Math.min(min_till_now, prices[i]);
            max_profit = Math.max(max_profit, prices[i] - min_till_now);
        }
        return max_profit;
    }
}