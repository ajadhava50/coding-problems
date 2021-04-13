package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("abc", "name", "abc", "ca");
        List<String> pune = Arrays.asList("abc", "pune", "abc", "ca");
        List<String> Mumbai = Arrays.asList("abc", "Mumbai", "abc", "ca");
        List<List<String>> all = new ArrayList<>();
        all.add(name);
        all.add(pune);
        all.add(Mumbai);

        all.stream()
                .flatMap(st->st.stream())
                .distinct()
                .forEach(System.out::println);


        name.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
            .distinct()
            .forEach(System.out::println);

    }
}
