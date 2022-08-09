package com.interview.questions;

//190. Reverse Bits
public class ReverseBits {
    // you need treat n as an unsigned value
    public static void main(String[] args) {

    }

    public int reverseBits(int n) {
        int result = 0;
        boolean isSigned = false;
        if (n < 0) {
            isSigned = true;
        }
        int val = 31;
        while (val != 0) {
            result |= (n & 1);
            n = n >> 1;
            result = result << 1;
            val--;
        }
        return isSigned ? result + 1 : result;
    }
}