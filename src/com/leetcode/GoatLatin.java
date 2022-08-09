package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class GoatLatin {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }

    public static String toGoatLatin(String sentence) {
        String result = "";
        Set<Character> vowels = new HashSet<>();
        for (Character vowel : "aeiouAEIOU".toCharArray()) {
            vowels.add(vowel);
        }
        int index = 1;
        for (String word : sentence.split("\\s")) {
            if (index > 1) {
                result += " ";
            }
            Character first_letter = word.charAt(0);
            if (vowels.contains(first_letter)) {
                result += word + "ma";
            } else {
                result += word.substring(1) + first_letter + "ma";
            }
            for (int i = 0; i < index; i++) {
                result += "a";
            }
            index++;
        }
        return result;
    }
}
