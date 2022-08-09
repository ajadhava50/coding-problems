package com.leetcode.bitmasking;

import java.util.stream.IntStream;

//Given an array of integers A, every element appears twice except for one. Find that single one.
public class SingleNumber {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static void main(String[] args) {
        System.out.println(singleNumber(IntStream.of(1, 2, 2, 3, 1).toArray()));
    }
    public static int singleNumber(final int[] A) {
        int ans = 0;
        for (int num : A) {
            ans = ans ^ num;
        }
        return ans;
    }
}
