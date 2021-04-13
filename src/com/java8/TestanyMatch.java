package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestanyMatch {

    public static void main(String args[])
    {
       boolean thread = Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    //System.out.println("map:"+s);
                    return s.toUpperCase();
                })
                .noneMatch(s -> s.startsWith("E") );

        System.out.println(thread);
    }
}
