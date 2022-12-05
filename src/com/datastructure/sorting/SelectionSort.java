package com.datastructure.sorting;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int aaa[] = {2, 7, 4, 3, 1, 6};
        System.out.println("SELECTION SORT");
        int a[] = {2, 7, 4, 3, 1, 6};

        for (int aa : a) {
            System.out.print(aa + " -->");
        }

        System.out.println();
        selectionSort(a);


    }


    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        Arrays.stream(a).forEach(i -> System.out.print("\t" + i));
    }

    }
