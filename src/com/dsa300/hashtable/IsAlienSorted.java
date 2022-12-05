package com.dsa300.hashtable;

import java.util.Arrays;

class IsAlienSorted {
    static int  char_map[] = new int[26];
    public static boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); i++) {
            char_map[order.charAt(i) - 'a'] = i;
        }

        for (int i = 1; i < words.length; i++)
            if (bigger(words[i - 1], words[i]))
                return false;

//        for (int i = 1; i < words.length; i++) {
//            String word1 = words[i - 1];
//            String word2 = words[i];
//            int len = Math.min(word1.length(), word2.length());
//            if (len != word1.length() && word1.startsWith(word2)) {
//                return false;
//            }
//            for (int j = 0; j < len; j++) {
//                int charIndex1 = char_map[word1.charAt(j) - 'a'];
//                int charIndex2 = char_map[word2.charAt(j) - 'a'];
//                if (charIndex1 > charIndex2) {
//                    return false;
//                }
//                if (charIndex1 < charIndex1) {
//                    break;
//                }
//            }
//        }


        return true;
    }
    static boolean bigger(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        for (int i = 0; i < n && i < m; ++i)
            if (s1.charAt(i) != s2.charAt(i))
                return char_map[s1.charAt(i) - 'a'] > char_map[s2.charAt(i) - 'a'];
        return n > m;
    }
    public static void main(String[] args) {
        String words[] = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println("ans:" + isAlienSorted(words, order));

    }
}