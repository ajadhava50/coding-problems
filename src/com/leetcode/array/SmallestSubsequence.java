package com.leetcode.array;

class SmallestSubsequence {
    public String smallestSubsequence(String s) {
        int start = 0, end = 0;
        while (end < s.length()) {
            char currentChar = s.charAt(end);
            while (currentChar - 'a' < s.charAt(start) - 'a') {
                start++;
            }
            end++;
        }
        return s.substring(start, end);

    }
}