package com.corejava.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCalculator<T extends Number & Comparable<T>> {

    public List<T> operands;

    public MyCalculator(List<T> operands) {
        this.operands = new ArrayList<>(operands);
    }

    public List<T> sortNumbers() {
        Collections.sort(operands);
        return operands;
    }

    public T getMax() {
        return Collections.max(operands);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 6, 2, 5, 9, 7);
        MyCalculator<Integer> cal = new MyCalculator<>(list);
        System.out.println(cal.sortNumbers());
        System.out.println(cal.getMax());

        List<Long> list1 = List.of(1L, 3L, 6L, 2L, 5L, 7L);
        MyCalculator<Long> cal1 = new MyCalculator<>(list1);
        System.out.println(cal1.sortNumbers());
        System.out.println(cal1.getMax());

    }
}
