package com.leetcode.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//859
public class BuddyString {
    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if(s.equals(goal)) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            if (set.size() < s.length())
                return true;
            else
                return false;
        }
        List<Integer> diffIndex = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i))
                diffIndex.add(i);
        }
        if (diffIndex.size() == 2
                && s.charAt(diffIndex.get(0)) == goal.charAt(diffIndex.get(1))
                && s.charAt(diffIndex.get(1)) == goal.charAt(diffIndex.get(0))) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

    }
}
