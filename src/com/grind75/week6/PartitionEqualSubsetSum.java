package com.grind75.week6;

//416. Partition Equal Subset Sum
class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if ((sum & 1) != 0)
            return false;
        sum = sum / 2;

        boolean dp[] = new boolean[sum + 1];
        dp[0] = true;
        for (int j : nums) {
            for (int i = sum; i >= j; i--) {
                dp[j] = dp[j] | dp[j - 1];
            }
        }
        return dp[sum];
    }
}