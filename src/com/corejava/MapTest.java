package com.corejava;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        Map map=new HashMap();
        Emp1 emp = new Emp1("abhi");
        map.put(emp,"mh");
        System.out.println(map.get(emp));
        emp.setName("ass");
        map.put(emp,"mhh");
        System.out.println(map.get(emp));
    }
}
