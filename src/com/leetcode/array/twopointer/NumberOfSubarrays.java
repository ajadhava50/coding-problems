package com.leetcode.array.twopointer;

import java.util.stream.IntStream;

//1248. Count Number of Nice Subarrays
class NumberOfSubarrays {

    public static int numberOfSubarrays(int[] A, int k) {
        return atMost(A, k) - atMost(A, k - 1);
    }

    public static int atMost(int[] nums, int k) {
        int result = 0, start = 0, end = 0;
        while (end < nums.length) {
            k -= nums[end] % 2;
            while (k < 0) {
                k += nums[start++] % 2;
            }
            result += end - start + 1;
            end++;
        }
        return result;
    }

    public static int numberOfSubarrays1(int[] A, int k) {
        if (A == null || A.length == 0) return 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                A[i] = 0;
            } else {
                A[i] = 1;
            }
        }

            int start = 0, end = 0, result = 0, sum = 0;
            while (end < A.length) {
                sum += A[end];
                while (start < A.length && sum >= k) {
                    if (A[start] == 1) {
                        sum -= A[start];
                        result += end - start + 1;
                    }
                    start++;
                }
                end++;
            }
        return result;
    }

    public static void main(String[] args) {

        numberOfSubarrays(IntStream.of(1, 1, 2, 1, 1).toArray(), 3);

    }
}
