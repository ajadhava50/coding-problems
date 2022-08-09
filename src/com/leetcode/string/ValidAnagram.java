package com.leetcode.string;

/*
242. Valid Anagram
 */

import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
        isAnagramPerfect("anagram", "nagaram");
    }

    //best way
    private static boolean isAnagramPerfect(String s, String t) {
        s = s.toLowerCase(Locale.ROOT);
        t = t.toLowerCase(Locale.ROOT);
        if (s.length() != t.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (char chr : s.toCharArray()) {
            counts[chr - 'a']++;
        }
        for (char chr : t.toCharArray()) {
            if (counts[chr - 'a'] == 0) return false;
            counts[chr - 'a']--;
        }
        return true;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        /*int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0)
                return false;
        }*/
        Map<Character, Long> map = s.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Character ch : t.toCharArray()) {
            if(!map.containsKey(ch))return false;
        }
        return true;

    }
}
