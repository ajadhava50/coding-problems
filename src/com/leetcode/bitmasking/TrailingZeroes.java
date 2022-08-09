package com.leetcode.bitmasking;

public class TrailingZeroes {
    public int trailingZeroes(int A) {
        int count=0;
        for (int i = 0; i < 31; i++) {
            if ((A & 1) == 0) {
                A = A << i;
                count++;
            }

        }
        return count;
    }
}
