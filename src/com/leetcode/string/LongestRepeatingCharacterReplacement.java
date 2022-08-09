package com.leetcode.string;

//424. Longest Repeating Character Replacement
class LongestRepeatingCharacterReplacement {


    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] char_counts = new int[26];
        int window_start = 0;
        int max_count = 0;
        int max_length = 0;
        for (int window_end = 0; window_end < n; window_end++) {
            char_counts[s.charAt(window_end) - 'A']++;
            int char_count = char_counts[s.charAt(window_end) - 'A'];
            max_count = Math.max(char_count, max_count);
            while (window_end - window_start - max_count + 1 > k) {
                char_counts[s.charAt(window_start) - 'A']--;
                window_start++;
            }
            max_length = Math.max(max_length, window_end - window_start + 1);
        }
        return max_length;
    }
}