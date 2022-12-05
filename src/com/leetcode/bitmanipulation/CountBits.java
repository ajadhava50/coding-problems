package com.leetcode.bitmanipulation;

class CountBits {
    public int[] countBits(int n) {
        //brute force
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            int num = i;
            int count = 0;
            while (num != 0) {
                count += num % 2;
                num = num / 2;
            }
            result[i] = count;
        }


        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                result[i] = result[i / 2];
            else
                result[i] = result[i / 2] + 1;
        }
        return result;
    }

}