package com.grind75.week8;

//224. Basic Calculator
class BasicCalculator {
    String s;
    public int calculate(String ss) {
        String s = ss;
        return dfs();
    }

    private int dfs() {
        int sum = 0;
        int operator = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                StringBuilder sb = new StringBuilder();
                while (i < s.length() && Character.isDigit(ch)) {
                    sb.append(ch);
                    i++;
                    ch = s.charAt(i);
                }
                i--;
                sum += Integer.parseInt(sb.toString()) * operator;
            } else if (ch == ')') {
                break;
            } else if (ch == '+') {
                operator = 1;
            } else if (ch == '-') {
                operator = -1;
            } else if (ch == '(') {
                i++;
                sum += operator * dfs();
            }
            i++;
        }
        return sum;
    }
}