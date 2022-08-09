package com.leetcode;

public class LongestPalindrome {
    public static boolean isPalindrome(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "dabcba";
        int maxPaliLength = 0;
        String longestPalindrome = null;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int len = j - i;
                String current = s.substring(i, j + 1);
                if (isPalindrome(current)) {
                    if (len > maxPaliLength) {
                        longestPalindrome = current;
                        maxPaliLength = len;
                    }
                }

            }

        }
        System.out.println(longestPalindrome);



    }
}
