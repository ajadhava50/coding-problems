package com.datastructure.array;

import java.util.Arrays;
import java.util.stream.IntStream;
//239. Sliding Window Maximum
class MaxSlidingWindow {
    public static void main(String[] args) {
        new MaxSlidingWindow().maxSlidingWindow(IntStream.of(1, 3, -1, -3, 5, 3, 6, 7).toArray(), 3);
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k+1];
         for (int i = 0; i <= nums.length - k; i++) {
             int max = nums[i];
             for (int j = 1; j < k; j++) {
                 if (nums[i+j] > max) {
                     max = nums[i+j];
                 }
             }
             result[i] = max;
         }
     Arrays.stream(result).forEach(i->System.out.println(i));
        return result;
    }
}