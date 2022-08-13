package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

//22. Generate Parentheses
class GenerateParenthesis {
    public static void main(String[] args) {
        generateParenthesis(3);
    }
    public static List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        backTrack(result, "", 0, 0, n);
        result.forEach(System.out::println);
        return result;

    }

    private static void backTrack(ArrayList<String> result, String currentString, int open, int close, int max) {

        if (currentString.length() == max * 2) {
            result.add(currentString);
            return;
        }
        if (open < max) backTrack(result, currentString + "(", open + 1, close, max);
        if (close < max) backTrack(result, currentString + ")", open, close + 1, max);
    }
}