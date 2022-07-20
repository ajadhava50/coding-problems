package com.java8.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (t) -> t % 2 == 0;
        predicate.test(2);
        Consumer<Integer> consumer=(t)-> {
            System.out.println(t);
        };
        Supplier<Integer> supplier=()-> 0;
        List list= Arrays.asList(1,2,3,4,5,6);
        list.stream().filter(predicate).findAny().orElseGet(supplier);
        list.forEach(consumer);
    }
}
