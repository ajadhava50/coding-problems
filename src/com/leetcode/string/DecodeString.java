package com.leetcode.string;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();
        String decodedString = "";
        int index = 0;
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int val = 0;
                while (Character.isDigit(s.charAt(index))) {
                    val = (val * 10) + (s.charAt(index) - '0');
                    index+=1;
                }
                counts.push(val);
            }else if (s.charAt(index) == '[') {
                result.push(decodedString);
                decodedString="";
                index+=1;
            } else if (s.charAt(index) == ']') {
                StringBuilder stringBuilder = new StringBuilder(result.pop());
                int count = counts.pop();
                for (int i = 0; i < count; i++) {
                    stringBuilder.append(decodedString);
                }
                decodedString = stringBuilder.toString();
                index+=1;
            } else {
                decodedString += ""+s.charAt(index);
                index++;
            }

        }
        return decodedString;
    }

    public static void main(String[] args) {
        String result=decodeString("3[a]1[b]");
        System.out.println(result);
        System.out.println(result.length());
    }
}
