package com.leetcode.array;

//806. Number of Lines To Write String
class NumberOfLines {

    public static void main(String[] args) {

    }

    public int[] numberOfLines(int[] widths, String s) {

        int[] result = new int[2];
        int width = 0;
        int no_lines = 0;
        for (char ch : s.toCharArray()) {
            int char_width = widths[ch - 'a'];
            if (char_width + width > 100) {
                no_lines++;
                width = 0;
            }
            width += char_width;
        }
        result[0] = no_lines;
        result[1] = width;
        return result;

    }
}