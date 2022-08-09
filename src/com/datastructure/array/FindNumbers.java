package com.datastructure.array;

//1295. Find Numbers with Even Number of Digits
class FindNumbers {
    public int findNumbers(int[] nums) {
        if (nums == null) return 0;
        int cnt = 0;
        for (int num : nums) {
            int result = getDigitCount(num);
            if (result % 2 == 0) cnt++;
        }
        return cnt;
    }

    private int getDigitCount(int num) {
        int digitCount = 0;
        while (num != 0) {
            num = num / 10;
            digitCount++;
        }
       // return digitCount;
        return (int) Math.log10(num) + 1;
    }
}