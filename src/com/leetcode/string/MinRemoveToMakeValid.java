package com.leetcode.string;

//1249. Minimum Remove to Make Valid Parentheses
class MinRemoveToMakeValid {
    public static void main(String[] args) {

    }

    public String minRemoveToMakeValid(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int open = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;

            } else if (ch == ')') {
                if (open == 0) continue;
                open--;
            }
            stringBuilder.append(ch);
        }
        StringBuilder result = new StringBuilder();
        for (int i = stringBuilder.length(); i > 0; i--) {
            char ch = stringBuilder.charAt(i);
            if (ch == '(' && open > 0) {
                open--;
                continue;
            }
            result.append(ch);
        }
        return result.toString();
    }
}