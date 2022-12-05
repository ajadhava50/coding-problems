package com.leetcode.bitmanipulation;

public class OneCountInBinary {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int oneCount = 0;
        while (n != 0) {
            n &= (n - 1);
            oneCount++;
        }
        return oneCount;
    }
}