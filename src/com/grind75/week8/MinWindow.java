package com.grind75.week8;

import java.util.HashMap;
import java.util.Map;

class MinWindow {
    public String minWindow(String searchString, String t) {
        int n = searchString.length();

        // It contains the min length seen so far
        int minWindowLengthSeenSoFar = Integer.MAX_VALUE;

        // It contains the minimum length substring
        String minWindow = "";

        // The nested for loop help us generate all the substrings
        for (int left = 0; left < n; left++) {
            for (int right = left; right < n; right++) {

                // Generate the substring
                String windowSnippet = searchString.substring(left, right + 1);

                // Check if the generated char contains all the characters of target
                boolean windowContainsAllChars = stringContainsAllCharacters(windowSnippet, t);

                // If it is a valid substring
                // And the length is less than the minimum so far
                // Update the answer
                if (windowContainsAllChars && windowSnippet.length() < minWindowLengthSeenSoFar) {
                    minWindowLengthSeenSoFar = windowSnippet.length();
                    minWindow = windowSnippet;
                }
            }
        }

        return minWindow;
    }

    // Helper function to check if all the char of string are
    // Present in the string searchString
    private boolean stringContainsAllCharacters(String searchString, String t) {
        Map<Character, Integer> requiredCharMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            requiredCharMap.put(ch, requiredCharMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : searchString.toCharArray()) {
            if (requiredCharMap.containsKey(ch)) {
                int count = requiredCharMap.get(ch) - 1;
                if (count == 0)
                    requiredCharMap.remove(ch);
                else
                    requiredCharMap.put(ch, count);
            }
        }
        return requiredCharMap.isEmpty();
    }
}