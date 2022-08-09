package com.leetcode.array;

import java.util.stream.IntStream;

class SumEvenAfterQueries {
    public static void main(String[] args) {
        int[][] queries = {
                {1, 0}, {-3, 1}, {-4, 0}, {2, 3}
        };
        sumEvenAfterQueries(IntStream.of(1, 2, 3, 4).toArray(), queries);

    }

    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
//        int[] output_array = new int[queries.length];
//        for (int i = 0; i < queries.length; i++) {
//            int index = queries[i][1];
//            int val = queries[i][0];
//            nums[index] += +val;
//            output_array[i] = evenSum(nums);
//        }
//        return output_array;


        int[] output_array = new int[queries.length];
        int evenSum = 0;
        for (int val : nums) {
            if (val % 2 == 0) {
                evenSum += val;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            int val = queries[i][0];
            if (nums[index] % 2 == 0) {
                evenSum-=nums[index];
            }
            nums[index]+=  + val;
            if (nums[index] % 2 == 0) {
                evenSum+=nums[index];
            }
            output_array[i]=evenSum;
        }
        return output_array;
    }

    public static int evenSum(int[] nums) {
        int evenSum = 0;
        for (int val : nums) {
            if (val % 2 == 0) {
                evenSum += val;
            }
        }
        System.out.println();
        return evenSum;
    }




}