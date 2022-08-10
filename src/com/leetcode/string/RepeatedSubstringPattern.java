package com.leetcode.string;

//459. Repeated Substring Pattern
class RepeatedSubstringPattern {
    public static void main(String[] args) {
        repeatedSubstringPattern("abcabcabcabc");
    }

    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = len / 2; i >= 1; i--) {
            if (len % i == 0) {
                int num_repeats = len / i;
                String subString = s.substring(0, i);
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < num_repeats; j++) {
                    stringBuilder.append(subString);
                }
                if (s.equals(stringBuilder.toString())) return true;
            }
        }
        return false;
    }
}