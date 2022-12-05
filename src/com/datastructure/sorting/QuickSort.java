package com.datastructure.sorting;

public class QuickSort {

    public static void main(String[] args) {

        //  int a[] = {2, 7, 4, 3, 1, 6};
        int a[] = {2, 7, 4, 3, 1, 6};
        for (int aa : a) {
            System.out.print(aa + " -->");
        }

        quickSort(a, 0, a.length - 1);
        System.out.println("\n AFTER sort");
        for (int aa : a) {
            System.out.print(aa + " -->");
        }
    }

     private static void quickSort(int[] a, int start, int end) {
         if (start < end) {
             int pIndex = partition(a, start, end);
             quickSort(a, start, pIndex - 1);
             quickSort(a, pIndex + 1, end);
         }
     }

     private static int partition(int[] a, int start, int end) {
         int pivot = a[end];
         int pIndex = start;
         for (int i = start; i < end; i++) {
             if (a[i] <= pivot) {
                 if(pIndex != i)
                     swap(a, pIndex, i);
                 pIndex++;
             }
         }
         if(pIndex != end)
             swap(a, pIndex, end);
         return pIndex;
     }
    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

