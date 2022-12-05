package com.datastructure.dp;

public class Knapsack {
    int t[][] = new int[102][1002];

    int maxProfit(int[] wt, int price[], int capacity, int n) {

        if (capacity == 0 || n == 0) return 0;
        if (t[n][capacity] != -1)
            return t[n][capacity];
        if (wt[n - 1] < capacity)
            return t[n][capacity] = Math.max(price[n - 1] + maxProfit(wt, price, capacity - wt[n - 1], n - 1),
                    maxProfit(wt, price, capacity, n - 1));
        else if (wt[n - 1] > capacity)
            return t[n][capacity] = maxProfit(wt, price, capacity, n - 1);

       return t[n][capacity] = maxProfit(wt, price, capacity, n - 1);

    }

    public static void main(String[] args) {

    }
}
