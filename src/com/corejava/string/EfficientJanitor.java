package com.corejava.string;

import java.util.Arrays;
import java.util.List;

public class EfficientJanitor {

    public static int efficientJanitor(){

        Double [] weight={1.01, 1.01, 1.99, 2.5, 1.5};
        List<Double> ll=Arrays.asList(weight);
        ll.sort((l1,l2)->l1.compareTo(l2));
        System.out.println(ll);

        int count = 0;
        int i=0;
        int j = weight.length-1;
        Arrays.sort(weight);
        while (i <= j) {
            count += 1;
            if(weight[i] + weight[j] <= 3.0)
            i += 1;
            j -= 1;
        }

        return count;
    }
    public static void main(String[] args) {

        System.out.println(efficientJanitor());
    }
}
