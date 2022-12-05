package com.grind75.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//438. Find All Anagrams in a String
class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0) return result;
        int[] char_count = new int[26];
        for (char ch : p.toCharArray()) {
            char_count[ch - 'a']++;
        }
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (char_count[s.charAt(right++) - 'a']-- >= 1) {
                count--;
            }
            if (count == 0) {
                result.add(left);
            }
            if (right - left == p.length() && char_count[s.charAt(left++) - 'a']++ >= 0) {
                count++;
            }
        }
        return result;
    }

    //Other way
    public List<Integer> findAnagrams1(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length()) return result;
        int phash[] = new int[26];
        int hash[] = new int[26];
        int right = 0, left = 0;
        while (right < p.length()) {
            phash[p.charAt(right) - 'a']++;
            hash[s.charAt(right++) - 'a']++;
        }
        right -= 1;
        while (right < s.length()) {
            if (Arrays.equals(hash, phash)) result.add(left);
            right += 1;
            if (right != s.length()) {
                hash[s.charAt(right) - 'a'] += 1;
            }
            hash[s.charAt(left) - 'a'] -= 1;
            left += 1;
        }
        return result;
    }

}