package com.datastructure.sorting;

public class QuickSort {

    public static void main(String[] args) {

        int a[] = {2, 7, 4, 3, 1, 6};
        for (int aa : a) {
            System.out.print(aa + " -->");
        }
        System.out.println();
        quickSort(a, 0, a.length-1);
        for (int aa : a) {
            System.out.print(aa + " -->");
        }
    }

    private static void quickSort(int[] a, int start, int end) {

        if (start < end) {
            int partionIndex = partion(a, start, end);
            quickSort(a, start, partionIndex - 1);
            quickSort(a, partionIndex + 1, end);

        }

    }

    private static int partion(int[] a, int start, int end) {

        int pivot = a[end];
        int partionIndex = start-1;
        for (int i = start; i < end; i++) {
            if (a[i] <= pivot) {
                int temp = partionIndex;
                partionIndex = a[i];
                a[i] = temp;
                partionIndex++;
            }
        }

        int temp = a[partionIndex];
        a[partionIndex] = a[end];
        a[end] = temp;
        return partionIndex+1;
    }
}
