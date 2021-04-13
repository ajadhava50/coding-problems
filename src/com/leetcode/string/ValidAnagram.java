package com.leetcode.string;

/*
242. Valid Anagram
 */

public class ValidAnagram {

        public boolean isAnagram(String s, String t) {

            if(s.length() != t.length()){
                return false;
            }

            int[] counts=new int[26];
            for(int i=0;i<s.length();i++){
                counts[s.charAt(i)-'a']++;
                counts[t.charAt(i)-'a']--;
            }

            for(int i=0;i<counts.length;i++){
                if(counts[i]!=0)
                    return false;
            }
            return true;

    }
}
