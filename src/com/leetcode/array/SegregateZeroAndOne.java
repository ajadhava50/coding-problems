package com.leetcode.array;

import java.util.Arrays;

public class SegregateZeroAndOne {
    public static void main(String[] args) {
        int a []={0,1,0,1,0,1,0,0,1,1,1,0,0,1,0,0,1,0,1,0};

        int low = 0,high = a.length-1;
        Arrays.stream(a).forEach(System.out::print);

        while (low<high){
            if(a[low]==0)
                low++;
            else if(a[high]==1)
                high--;
            else if(a[low]==1 && a[high]==0){
                int temp=a[low];
                a[low]=a[high];
                a[high]=temp;
                low++;
                high--;
            }
        }
        System.out.println("after:");
        Arrays.stream(a).forEach(System.out::print);

    }
}
