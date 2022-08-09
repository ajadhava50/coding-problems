package com.datastructure.array;

class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int[] balances : accounts) {
            int total_balance = 0;
            for (int balance : balances) {
                total_balance += balance;
            }
            if (total_balance > result)
                result = total_balance;
        }
        return result;

    }
}