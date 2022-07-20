package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class FizBuzz {

    public static void main(String[] args) {
        System.out.println(printFIzBuzz(30));
    }

    private static List<String> printFIzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int j = 0, fiz = 0, buz = 0; j < n; j++, fiz++, buz++) {

            if (fiz == 3 && buz == 5) {
                result.add("FizBuzz");
                fiz = 0;
                buz = 0;
            } else if (fiz == 3) {
                result.add("Fiz");
                fiz = 0;
            } else if (buz == 5) {
                result.add("Buz");
                buz = 0;
            } else {
                result.add(String.valueOf(j));
            }
        }
        return result;
    }
}
