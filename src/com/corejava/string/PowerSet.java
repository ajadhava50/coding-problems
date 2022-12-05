package com.corejava.string;

public class PowerSet {


    public static void main(String[] args) {
        String s = "abc";
        printPowerSet(s, 0, "");

    }

    private static void printPowerSet(String s, int index, String currentString) {

        if (index == s.length()) {
            System.out.println(currentString);
            return;
        }
        printPowerSet(s, index + 1, currentString + s.charAt(index));
        printPowerSet(s, index + 1, currentString);
    }
}
