package com.leetcode;

import java.util.HashMap;
import java.util.Map;

//290. Word Pattern
class WordPattern {
    public static void main(String[] args) {

        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char current_char = pattern.charAt(i);
            if (map.containsKey(current_char)) {
                if (!map.get(current_char).equals(words[i])) return false;
            } else {
                if (map.containsValue(words[i])) return false;
                map.put(current_char, words[i]);
            }
        }

        return true;

    }
}