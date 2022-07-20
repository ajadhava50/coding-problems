package com.leetcode;


public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(321+" reverseNumber:"+reverseNumber(321));
        System.out.println(-321+" reverseNumber:"+reverseNumber(-321));

    }

    private static int reverseNumber(int n) {
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n = 0 - n;
        }
        int result = 0;
        while (n > 0) {
            int mod = n % 10;
            n = n / 10;
            result = result * 10 + mod;
        }
        if (isNegative) {
            result = 0 - result;
        }
        return result;
    }
}
