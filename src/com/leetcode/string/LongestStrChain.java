package com.leetcode.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

//1048. Longest String Chain
class LongestStrChain {

    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparing(String::length).thenComparing(Function.identity()));
        Map<String, Integer> map = new HashMap();
        int result = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String predecessor = word.substring(0, i) + word.substring(i + 1);
                int wordLength = Math.max(map.getOrDefault(word, 0), map.getOrDefault(predecessor, 0) + 1);

                map.put(word, wordLength);
            }
            result = Math.max(result, map.get(word));
        }
        return result;
    }
}
