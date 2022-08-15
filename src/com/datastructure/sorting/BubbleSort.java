package com.datastructure.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {

    public static void main(String[] args) {
        bubbleSort(IntStream.of(5, 1, 4, 2, 8).toArray());
    }

    private static void bubbleSort(int[] nums) {
        Arrays.stream(nums).forEach(i -> System.out.print("\t" + i));
        System.out.println("\nAfter SORT");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }
        }

        Arrays.stream(nums).forEach(i -> System.out.print("\t" + i));
        System.out.println();

    }
}
