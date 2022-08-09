package com.leetcode.string;

class MaxNumberOfBalloons {
    public static void main(String[] args) {
        maxNumberOfBalloons("nlaebolko");
    }

    public static int maxNumberOfBalloons(String text) {

        int char_count[] = new int[26];
        for (char ch : text.toCharArray()) {
            char_count[ch - 'a']++;
            System.out.println(ch-'a');
        }
        int min = char_count[0];
        min = Math.min(min, char_count[1]);
        min = Math.min(min, char_count[11] / 2);
        min = Math.min(min, char_count[14] / 2);
        min = Math.min(min, char_count[13]);
        return min;
    }
}