package com.grind75.week7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//17. Letter Combinations of a Phone Number
class LetterCombinations {

       public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        String mappings[] = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combination(mappings, digits, result, "", 0);
        return result;
    }

    public void combination(String mappings[], String digits, List<String> result, String current, int index) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String letters = mappings[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            combination(mappings, digits, result, current + letters.charAt(i), index + 1);
        }
    }

    //other way

    public List<String> letterCombinations1(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if (digits.isEmpty()) return ans;
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while (ans.peek().length() == i) { //ans.peek() check the first letter in LinkedList of  string
                String t = ans.remove(); //ans.remove() remove the first letter in LinkedList of  string
                for (char s : mapping[x].toCharArray())
                    ans.add(t + s);
            }
        }
        return ans;
    }
}