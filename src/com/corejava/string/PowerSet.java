package com.corejava.string;

public class PowerSet {


    public static void main(String[] args) {
        String s = "abc";
        printPowerSet(s, 0, "");

    }

    private static void printPowerSet(String s, int i, String currentString) {

        if (i == s.length()) {
            System.out.println(currentString);
            return;
        }
        printPowerSet(s, i + 1, currentString + s.charAt(i));
        printPowerSet(s, i + 1, currentString);
    }
}
