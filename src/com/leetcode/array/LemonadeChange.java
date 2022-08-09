package com.leetcode.array;

//860. Lemonade Change
class LemonadeChange {
    public static void main(String[] args) {
        int bills[] = {5, 5, 5, 10, 20};

        lemonadeChange(bills);

    }

    public static boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for (int bill : bills) {
            if (bill == 5) {
                fives--;
            } else if (bill == 10) {
                fives--;
            } else if (tens > 0) {
                tens--;
                fives--;
            } else {
                fives -= 3;
            }
            if (fives < 0) return false;
        }
        return true;
    }
}