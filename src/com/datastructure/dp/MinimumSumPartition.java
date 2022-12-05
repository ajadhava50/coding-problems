package com.datastructure.dp;

public class MinimumSumPartition {


    public int minDifference(int arr[], int n) {
        // Your code goes here
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        boolean t[][] = new boolean[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) t[i][j] = true;
                if (j == 0) t[i][j] = false;
            }
        }
        //Filling up the table
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = (t[i - 1][j - arr[i - 1]] || t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        //All the subset sum which is possible for this n sized array will have true value in table in nth row
        for (int j = 0; j < sum + 1; j++) {
        // abs(sum - 2*(subset_sum) will give subset sum difference
            if (t[n][j] == true) ans = Math.min(ans, Math.abs(sum - 2 * j));
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
