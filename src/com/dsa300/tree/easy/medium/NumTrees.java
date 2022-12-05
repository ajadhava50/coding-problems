package com.dsa300.tree.easy.medium;

class NumTrees {
    public static int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                int leftBST = dp[j - 1];
                int rightBST = dp[i - j];
                sum += leftBST * rightBST;
                System.out.println(leftBST + ":::" + rightBST + "sum:" + sum);
            }
            dp[i] = sum;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numTrees(4));
    }
}