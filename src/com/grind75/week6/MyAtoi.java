package com.grind75.week6;

//8. String to Integer (atoi)
class MyAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("4193 with words"));

    }

    public static int myAtoi(String s) {
        s = s.trim();
        if (s == null || s.length() == 0)
            return 0;
        double result = 0;
        int i = 0;
        char flag = '+';
        if (s.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        while (s.length() > i && s.charAt(i) > '0' && s.charAt(i) <= '9') {
            result = result * 10 + s.charAt(i)-'0';
            i++;
        }
        if (flag == '-') {
            return -(int)result;
        }
        return (int)result;

    }
}