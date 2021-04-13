package com.leetcode.array;

import java.util.Arrays;

//Remove Duplicate Elements from Unsorted Array - Java Code
public class RemoveDuplicate {
    public static void main(String[] args) {

        int a[]={3,1,4,2,4,5,6,7,4,6,7,8,9};

        Arrays.sort(a);
        int j=0;
        for (int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                a[j++]=a[i];
            }
        }
        a[j++]=a[a.length-1];
        for (int i=0;i<j;i++){
            System.out.println(a[i]);
        }

    }
}
