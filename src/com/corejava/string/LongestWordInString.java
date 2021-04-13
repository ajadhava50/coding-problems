package com.corejava.string;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordInString {
    public static void main(String[] args) {
        String name = new String("my name is abhijeet  abhijeet abhijeetjadhav");
             Arrays.stream(name.split(" "))
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .findFirst().ifPresent(System.out::println);
    }
}
