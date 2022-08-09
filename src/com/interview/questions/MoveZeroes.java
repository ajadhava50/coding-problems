package com.interview.questions;

import java.util.stream.IntStream;

class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(IntStream.of(0, 1, 0, 3, 12).toArray());
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) nums[index++] = num;
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}