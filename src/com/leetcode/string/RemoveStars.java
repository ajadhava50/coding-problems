package com.leetcode.string;

import java.util.Stack;

//2390. Removing Stars From a String
class RemoveStars {
    public static String removeStars(String s) {
        int j = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == '*') {
                j--;
            } else {
                ch[j] = ch[i];
                j++;
            }
        }
        return String.valueOf(ch).substring(0, j);
    }

    public static void main(String[] args) {
        removeStars("leet**cod*e");
    }


}