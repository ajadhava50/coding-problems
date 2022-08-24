package com.leetcode.money;

//1716. Calculate Money in Leetcode Bank
class TotalMoney {
    public static void main(String[] args) {
        System.out.println(totalMoney(10));
    }

    public static int totalMoney(int n) {
        int weekCount;
        int dayCount;
        int totalMoney = 0;
        for (int i = 1; i <= n; i++) {
            weekCount = i / 7;
            dayCount = i % 7;
            if (dayCount == 0) {
                dayCount = 6;
            }
             totalMoney = totalMoney + dayCount + weekCount;
        }
        return totalMoney;

    }
}