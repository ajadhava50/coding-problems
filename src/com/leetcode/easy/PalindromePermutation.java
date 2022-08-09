package com.leetcode.easy;

public class PalindromePermutation {
    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("aab"));
        System.out.println(canPermutePalindrome("code"));
        System.out.println(canPermutePalindrome("carerac"));
    }

    public static boolean canPermutePalindrome(String s) {
        int[] char_count = new int[128];
        for (char ch : s.toCharArray()) {
            char_count[ch]++;
        }
        int count = 0;
        for (int i = 0; i < 128; i++) {
            count += char_count[i] % 2;
        }
        return count <= 1;
    }
}
