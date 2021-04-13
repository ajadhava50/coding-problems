package com.java8;

@FunctionalInterface
public interface TestDefault {

    public String name();

    public default String name1(String name){
        System.out.println("from interface default ");
        return "Hi"+name;
    }

    public static String name6(String name){
        System.out.println("from interface default ");
        return "Hi"+name;
    }


}