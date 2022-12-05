package com.datastructure.sorting;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {

        int a[] = {2, 7, 4, 3, 1, 6};
        //int a[] = {2,3,1};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(a, 0, a.length-1);
        Arrays.stream(a).forEach(System.out::println);
    }

    private void sort(int[] a, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(a, left, mid);
            sort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    private void merge(int[] a, int left, int mid, int right) {
        int b[] = new int[right + 1];
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (a[i] > a[j]) {
                b[k] = a[j];
                j++;
            } else {
                b[k] = a[i];
                i++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= right) {
                b[k] = a[j];
                j++;
                k++;
            }
        }
        if (j > right) {
            while (i <= mid) {
                b[k] = a[i];
                i++;
                k++;
            }
        }
        for (int l = left; l <=right; l++) {
            a[l] = b[l];
        }
    }
}
