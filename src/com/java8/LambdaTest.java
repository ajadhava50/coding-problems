package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class LambdaTest {


    public static void main(String arg[]) {
        /*Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 11);
        items.put("C", 12);
        items.put("D", 13);
        items.put("E", 14);
        items.put("F", 15);
        items.put("G", 16);
        items.put("H", 17);

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
           // System.out.println("Item:" + entry.getKey() + "value:" + entry.getValue());
        }

        items.forEach((k,v)->{
            System.out.println("item:"+k+" value:"+v);
            if ("E".equals(k)){
                System.out.println("e is present");
            }
        });*/

        Add add = (num1, num2) -> num1 + num2;
        System.out.println(add.add(1,2));

        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        items.forEach(System.out::println);
        items.stream()
                .filter(s->s.contains("E"))
                .forEach(System.out::println);
    }
}
