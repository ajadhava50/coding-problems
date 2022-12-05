package com.leetcode.bitmanipulation;

//GFG find position of set bit
public class FindSetBitPosition {

    public int findposition(int num) {
        if (num == 0) return -1;
        if ((num & num - 1) == 0) return (int) (Math.log(num) + 1);
        return -1;
    }
}
