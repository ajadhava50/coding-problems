package com.leetcode.array;

public class ShortestDistanceToCharacter {
    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int output_array[] = new int[n];
        int c_position = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == c) {
                c_position = i;
            }
            output_array[i] = i - c_position;
        }
        for (int i = n - 1; i > 0; i--) {
            if (s.charAt(i) == c) {
                c_position = i;
            }
            output_array[i] = Math.min(output_array[i], c_position-i);
        }
        return output_array;

    }

    public static void main(String[] args) {
        int result[] = shortestToChar("loveleetcode", 'e');
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
}
