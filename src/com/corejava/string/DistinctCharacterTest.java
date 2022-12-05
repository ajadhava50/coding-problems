package com.corejava.string;

import java.util.*;

public class DistinctCharacterTest {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        String test = "xabcbbccc";
        boolean[] uniqueChar = new boolean[26];
        for (char ch : test.toCharArray()) {
            if (!uniqueChar[ch - 'a']) {
                uniqueChar[ch - 'a'] = true;
                stringBuilder.append(ch);
            }
        }
        System.out.println(stringBuilder.toString());
       /* for (char ch : test.toCharArray()) {
            if (uniqueChar[ch - 'a']) {
                stringBuilder.append(ch);
                uniqueChar[ch - 'a'] = false;
            }
        }
        System.out.println(stringBuilder.toString());
        ArrayList<Character> list = new ArrayList<>();
        for (Character ch : test.toCharArray()) {
            list.add(ch);
        }
        list.stream().distinct().forEach(System.out::println);*/

    }


}
