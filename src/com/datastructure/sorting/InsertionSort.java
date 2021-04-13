package com.datastructure.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InsertionSort {

    public void m1(String s){
        System.out.println(s);
    }public void m1(Object s){
        System.out.println(s);
    }

    public static void main(String[] args) {

        /*int a[] = {2, 7, 4, 3, 1, 6};

        for (int i = 0; i < a.length; i++) {
            int hole = i;
            int value = a[i];
            while (hole > 0 && a[hole - 1] > value) {
                a[hole] = a[hole - 1];
                hole = hole - 1;
            }
            a[hole] = value;
        }
        Arrays.stream(a).forEach(System.out::println);*/

      /*  String name = "Abhijeet";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : name.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        map.entrySet()
                .stream()
                .forEach(e->System.out.println(e.getKey() + ":::" + e.getValue()));

        map.forEach((k, v) -> System.out.println(k + ":" + v));*/

        String s1="Dhanashree";
        String s2="Dhanashree";

            char[] a1= s1.toCharArray();
            char[] a2=s2.toCharArray();
            boolean flag=true;

            flag=Arrays.equals(a1,a2);
        System.out.println(flag);


    }
}
