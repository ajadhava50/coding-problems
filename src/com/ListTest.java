package com;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(2);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer ii = (Integer) iterator.next();
            if (ii == 3) {
                iterator.remove();
            }
            System.out.println(ii);
        }
        System.out.println(list);
    }
}
