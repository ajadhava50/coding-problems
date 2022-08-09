package com.leetcode.array;

import java.util.Arrays;
import java.util.stream.IntStream;

class ProductExceptSelf {
    public static void main(String[] args) {
        //productWithDivideExceptSelf(IntStream.of(1, 2, 3, 4).toArray());
        //productExceptSelf(IntStream.of(1, 2, 3, 4).toArray());
        productExceptSelfWithlessLoop(IntStream.of(1, 2, 3, 4).toArray());
    }

    private static void productExceptSelfWithlessLoop(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int r = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * r;
            r = r * nums[i];
        }
    }

    private static void productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left_products = new int[n];
        int[] right_products = new int[n];
        int[] result = new int[n];

        left_products[0] = 1;
        right_products[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            left_products[i] = left_products[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right_products[i] = right_products[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            result[i] = left_products[i] * right_products[i];
        }
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] productWithDivideExceptSelf(int[] nums) {
        int product = 1;
        for (int num : nums)
            System.out.println(product);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = product / nums[i];
        }
        return nums;
    }
}