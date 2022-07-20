package com.corejava;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        Map map = new HashMap();
        Emp1 emp = new Emp1("abhi");
        Emp1 emp2 = new Emp1("abhi");
        map.put(emp, "mh");
        map.put(emp2, "mh2");
        System.out.println(map.get(emp));
        emp.setName("ass");
        map.put(emp, "mhh");
        System.out.println(map.get(emp));

        System.out.println("string:" + new String("abhi").equals(new String("abhi")));

        map.put(new String("abhi"), "abhi");
        map.put(new String("abhi"), "abhi1");

        map.forEach((k, v) -> System.out.println(k + "::" + v));

    }
}
