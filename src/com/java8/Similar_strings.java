package com.java.test;

import java.util.HashMap;
import java.util.Map;

public class Similar_strings {



    static int countManipulations(String a)
    {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : a.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        map.forEach((k,v)-> System.out.println(k+"::"+v));

        return 0;

    }

    public static void main(String[] args) {

        String s1 = "cdecdee";

        System.out.println(countManipulations(s1));

    }

}
