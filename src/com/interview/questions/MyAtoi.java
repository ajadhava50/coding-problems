package com.interview.questions;

class MyAtoi {
    public int myAtoi(String s) {
        // trim white spaces
        s = s.trim();
        if (s == null || s.length() < 1)
            return 0;
        char flag = '+';
        // check negative or positive
        int i = 0;
        if (s.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        double result = 0;
        while (s.length() > i && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            result = result * 10 + s.charAt(i) - '0';
            i++;
        }
        if (flag == '-')
            result = -result;
        if (result > Integer.MAX_VALUE) result = Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) result = Integer.MIN_VALUE;
        return (int)result;
    }
}