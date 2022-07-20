package com.leetcode.easy;

public class ReverseString {
    public static void main(String[] args) {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        for (char ch : input) {
            System.out.println(ch);
        }
        System.out.println("reverse");
        reverseString(input);
        for (char ch : input) {
            System.out.println(ch);
        }

    }

    private static char[] reverseString(char[] input) {

        int start = 0;
        int end = input.length - 1;
        while (start < end) {
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        return input;
    }
}
