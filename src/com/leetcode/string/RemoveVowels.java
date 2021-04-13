package com.leetcode.string;

/*
leetcode 1119 remove vowels from String
 */

import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {

    public static  String removeVowels(String string) {

        StringBuilder result = new StringBuilder();
        Set<Character> vowels = new HashSet();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for (Character ch : string.toCharArray()) {
            if (!vowels.contains(ch))
                result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {


        System.out.println(removeVowels("abhijeet"));

    }
}
