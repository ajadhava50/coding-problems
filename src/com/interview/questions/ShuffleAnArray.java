package com.interview.questions;

import java.util.Random;

class ShuffleAnArray {
    private int[] nums;
    private Random random;

    public ShuffleAnArray(int[] nums) {
        this.nums = nums;
        random = new Random();

    }

    public int[] reset() {
        return nums;

    }

    public int[] shuffle() {
        if (nums == null) return null;
        int a[] = nums.clone();
        for (int i = 1; i < a.length; i++) {
            int current = random.nextInt(i + 1);
            swap(a, current, i);
        }
        return a;

    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}