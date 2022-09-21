package com.datastructure.array;

public class MaxSubArraySum {

    public static int maxSubArraySum(int a[]) {

        int max_so_far = 0, max_ending_here = 0;

        for (int i = 0; i < a.length - 1; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_ending_here < 0) {
                max_ending_here = 0;
            } else if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        return max_so_far;
    }

    public static void main(String[] args) {

        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int b[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
      //  int max_sum = maxSubArraySum(a);
        int max_sum = maxSubArraySum(b);
        System.out.println("Maximum contiguous sum is "
                + max_sum);
    }
}
