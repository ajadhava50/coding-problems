package com.datastructure.sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int a[] = {2,7,4,3,1,6};

        for (int aa:a) {
            System.out.print(aa +" -->");
        }

        System.out.println();
        for (int i = 0; i < a.length-1; i++) {

            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int aa:a) {
            System.out.print(aa +" -->");
        }

    }

}
