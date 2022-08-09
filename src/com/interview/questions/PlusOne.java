package com.interview.questions;

import java.util.Arrays;
import java.util.stream.IntStream;

//66. Plus One
class PlusOne {
    public static void main(String[] args) {
        Arrays.stream(plusOne(IntStream.of(0).toArray())).forEach(System.out::println);
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length-1; i > 0; i--) {
            int sum = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;
            digits[i] = sum;
        }
        if (carry > 0) {
            int digits1[] = new int[digits.length + 1];
            digits1[0] = carry;
            for (int i = 0; i < digits.length - 1; i++) {
                digits1[i + 1] = digits[i];
            }
            return digits1;
        }
        return digits;
    }
}