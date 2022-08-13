package com.leetcode.string;

import java.util.ArrayList;
import java.util.List;

class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();
        int char_count[] = new int[26];
        for (char ch : p.toCharArray()) {
            char_count[ch - 'a']++;
        }

        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (char_count[s.charAt(right++) - 'a']-- >= 1) {
                count--;
            }
            if (count == 0) result.add(left);
            if (right - left == p.length() && char_count[s.charAt(left++) - 'a']++ >= 0) count++;
        }
        return result;
    }
}