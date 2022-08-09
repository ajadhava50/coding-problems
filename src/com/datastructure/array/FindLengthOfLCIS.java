package com.datastructure.array;

import java.util.stream.IntStream;

//674. Longest Continuous Increasing Subsequence
class FindLengthOfLCIS {
    public static void main(String[] args) {
        findLengthOfLCIS(IntStream.of(1, 3, 5, 4, 7).toArray());

    }

    public static int findLengthOfLCIS(int[] nums) {
        int result = 0;
        int window = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] >= nums[i - 1]) {
                window = i;
                result = Math.max(result, i - window + 1);
            }
        }
        return result;
    }
}