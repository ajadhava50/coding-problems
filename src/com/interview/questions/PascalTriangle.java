package com.interview.questions;

import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int c = 1;
            List<Integer> list1 = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                list1.add(c);
                System.out.print(c + "\t");
                c = c * (i - j) / j;
            }
            list.add(list1);
            System.out.println();
        }
    }


    public static List<List<Integer>> generate(int numRows) {
        return null;
    }
}