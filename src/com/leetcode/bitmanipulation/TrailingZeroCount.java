package com.leetcode.bitmanipulation;

public class TrailingZeroCount {
    public static void main(String[] args) {

    }


    public int trailingZero(int n) {
        int zeroCount = 0;
        while (n % 2 == 0) {
            n = n >> 1;
            zeroCount++;
        }
        return zeroCount;
    }
}
