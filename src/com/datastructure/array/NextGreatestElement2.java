package com.datastructure.array;

import java.util.Arrays;
import java.util.Stack;
//503. Next Greater Element II
public class NextGreatestElement2 {
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] output_arrray = new int[n];
        Arrays.fill(output_arrray, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n * 2; i++) {
            System.out.println("nums:::" + i % n);
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                output_arrray[i % n] = stack.pop();
            }
            if (i < n) stack.push(i);
        }

        return output_arrray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 12, 6, 4};
        nextGreaterElement(nums1);

    }
}
