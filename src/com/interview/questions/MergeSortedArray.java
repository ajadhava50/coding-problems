package com.interview.questions;

import java.util.stream.IntStream;

class MergeSortedArray {
    public static void main(String[] args) {
        merge(IntStream.of(0).toArray(), 0, IntStream.of(6).toArray(), 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int p1 = m - 1, p2 = n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums2[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }
    }
}