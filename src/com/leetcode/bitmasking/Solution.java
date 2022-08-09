package com.leetcode.bitmasking;

import java.util.stream.IntStream;

//Given an array of integers, every element appears thrice except for one which occurs once.
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static void main(String[] args) {
        singleNumber(IntStream.of(1, 2, 4, 3, 3, 2, 2, 3, 1, 1).toArray());
    }

    public static int singleNumber(final int[] A) {
        int p = 1, odd = 0, ans = 0;
        for (int i = 0; i < 31; i++) {
            odd = 0;
            for (int j = 0; j < A.length; j++) {
                int x = A[j] & p;
                if (x != 0)
                    odd++;

            }
            if (odd % 3 != 0)
                ans = ans + p;
            p = p * 2;
        }
        System.out.println(ans);
        return ans;
    }
}
