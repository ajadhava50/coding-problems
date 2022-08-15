package com.leetcode.string;

class CheckIfPangram {
    public static void main(String[] args) {
        checkIfPangram("abce");
    }

    public static boolean checkIfPangram(String sentence) {
        int result[] = new int[26];
        for (char ch : sentence.toCharArray()) {
            result[ch - 'a']++;
        }
        for (int val : result) {
            if (val == 0)
                return false;
        }
        return true;
    }
}