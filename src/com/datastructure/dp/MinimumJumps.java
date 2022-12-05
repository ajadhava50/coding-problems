package com.datastructure.dp;

import java.util.Arrays;
import java.util.stream.IntStream;

class MinimumJumps {
    public static int jump(int[] nums) {
//        int n = nums.length;
//        int[] min_jump = new int[n];
//        Arrays.fill(min_jump, Integer.MAX_VALUE);
//        min_jump[0] = 0;
//        for (int i = 1; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                if (i <= j + nums[j])
//                    min_jump[i] = Math.min(min_jump[i], min_jump[j] + 1);
//            }
//        }
//        return min_jump[n - 1];


        int jump = 0, current = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == farthest) {
                jump++;
                current = farthest;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        System.out.println(jump(IntStream.of(2, 3, 1, 1, 4).toArray()));
    }
}