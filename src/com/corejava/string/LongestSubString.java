package com.corejava.string;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "dvdf";
        System.out.println(longestSubstring(str));
    }

    private static String longestSubstring(String str) {
        int a_pointer = 0;
        int b_pointer = 0;
        int maxSubString=0;
        HashSet<Character> hashSet = new HashSet<>();
        while (b_pointer < str.length()) {
            if (!hashSet.contains(str.charAt(b_pointer))) {
                hashSet.add(str.charAt(b_pointer));
                b_pointer++;
                maxSubString = Math.max(hashSet.size(),maxSubString);
            } else {
                hashSet.remove(str.charAt(a_pointer));
                a_pointer++;
            }

        }
        String result = "";
        for (int i = a_pointer; i < b_pointer; i++) {
            result += str.charAt(i);
        }
        return result;
    }
}
