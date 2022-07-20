package com.leetcode.string;
//LeetCode 796
public class RotateString {
    public static boolean rotateString(String s, String goal) {
        return s.length() ==goal.length() && (s+s).contains(goal);
    }
    public static void main(String[] args) {

        System.out.println(rotateString("abcde", "cdeab"));

    }
}
