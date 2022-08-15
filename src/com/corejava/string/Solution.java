package com.corejava.string;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public static void main(String[] args) {
        numSubarrayProductLessThanK(IntStream.of(10, 5, 2, 6).toArray(), 100);
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        Arrays.stream(nums).forEach(i -> System.out.print("\t," + i));
        System.out.println();
        if (k <= 1) return 0;
        int prod = 1;
        int result = 0;
        int left = 0, right = 0;
        while (right < nums.length) {
            prod *= nums[right];
            System.out.print("\tnums[right] : " + nums[right]);
            System.out.print("\tprod : " + prod);
            while (prod >= k) {
                prod /= nums[left];
                left++;
            }
            System.out.print("\tprod : " + prod);
            System.out.print("\tleft : " + left);
            System.out.print("\tright : " + right);
            result += right - left + 1;
            System.out.print("\tresult : " + result);
            right++;
            System.out.println();
        }
        return result;
    }

    public int maxProfit(int[] prices) {
        int min_till_now = Integer.MAX_VALUE, max_profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            min_till_now = Math.min(min_till_now, prices[i]);
            max_profit = Math.max(max_profit, prices[i] - min_till_now);
        }
        return max_profit;
    }
}