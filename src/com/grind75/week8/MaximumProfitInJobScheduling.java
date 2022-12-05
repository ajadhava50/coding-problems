package com.grind75.week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MaximumProfitInJobScheduling {
    private class Job {
        private int startTime;
        private int endTime;
        private int profit;

        public Job(int startTime, int endTime, int profit) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.profit = profit;
        }

        public int getStartTime() {
            return startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public int getProfit() {
            return profit;
        }

    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        List<Job> jobs = new ArrayList<>();
        for (int i = 0; i < startTime.length; i++) {
            jobs.add(new Job(startTime[i], endTime[i], profit[i]));
        }
        Collections.sort(jobs, Comparator.comparing(job -> job.getEndTime()));
        int len = startTime.length;
        int[] dp = new int[len];
        dp[0] = jobs.get(0).profit;

        dp[0] = jobs.get(0).profit;
        for (int i = 1; i < jobs.size(); i++) {
            dp[i] = Math.max(jobs.get(i).profit, dp[i - 1]);
            for (int j = i - 1; j >= 0; j--) {
                if (jobs.get(j).endTime <= jobs.get(i).startTime) {
                    dp[i] = Math.max(dp[i], jobs.get(i).profit + dp[j]);
                    break;
                }
            }
        }
        int maxVal = Integer.MIN_VALUE;
        for (int val : dp) {
            if (maxVal < val) {
                maxVal = val;
            }
        }
        return maxVal;


       /* for (int index = 1; index < len; index++) {
            int low = 0;
            int high = index - 1;
            while (low < xc dxc vfr4rfcv gtgfv ) {
                int mid = low + (high - low + 1) / 2;
                if (jobs.get(mid).endTime <= jobs.get(index).startTime)
                    low = mid;
                else
                    high = mid - 1;
            }
            dp[index] = jobs.get(index).profit;
            if (jobs.get(low).endTime <= jobs.get(index).startTime)
                dp[index] += dp[low];

            dp[index] = Math.max(dp[index], dp[index - 1]);
        }
        return dp[len - 1];*/

    }
}