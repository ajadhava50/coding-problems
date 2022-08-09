package com.interview.questions;

//28. Implement strStr()
class StrStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int m = haystack.length();
        int n = needle.length();
        if (n > m) return -1;

        for (int i = 0; i < (m - n) + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, n + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}