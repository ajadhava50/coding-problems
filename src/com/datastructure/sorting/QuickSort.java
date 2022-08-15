package com.datastructure.sorting;

public class QuickSort {

    public static void main(String[] args) {

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
        int pIndex = start - 1;
        for (int i = start; i < end; i++) {
            if (a[i] <= pivot) {
                int temp = pIndex;
                pIndex = a[i];
                a[i] = temp;
                pIndex++;
            }
        }
        int temp = a[pIndex];
        a[pIndex] = a[end];
        a[end] = temp;
        return pIndex + 1;
    }
}
