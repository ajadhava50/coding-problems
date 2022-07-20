package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Similar_strings {

    static Character firstRepeatedCharacter(String word) {
        return word.chars().mapToObj(chr -> Character.valueOf((char) chr))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(Map.Entry::getKey)
                .findFirst().get();

    }

    static Character firstNonRepeatedCharacter(String word) {
        return word.chars().mapToObj(chr -> Character.valueOf((char) chr))
                 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst().get();

    }

    static Character maxOccurredCharacter(String word) {
        return word.chars().mapToObj(chr -> Character.valueOf((char) chr))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .max((e1, e2) -> e1.getValue() > e2.getValue() ? 1 : -1)
                .get().getKey();

    }

    static int countManipulations(String a) {
        a.chars().mapToObj(it -> Character.valueOf((char) it))
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .forEach((k) -> System.out.println(k));


        return 0;

    }

    public static void main(String[] args) {

        String s1 = "cdecdee";
        String java = "Java";

        System.out.println(countManipulations(s1));
        System.out.println("maxOccurredCharacter:" + maxOccurredCharacter(s1));
        System.out.println("first non repeating char:" + firstNonRepeatedCharacter(java));
        System.out.println("first repeating char:" + firstRepeatedCharacter(java));
    }

}
