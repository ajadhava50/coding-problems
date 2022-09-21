package com.datastructure.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

//User function Template for Java
//Input:  arr[] = {1, 6, 4, 10, 2, 5}
//        Output:         {-1,4,2,2,-1,-1}
class NextSmaller {
    public static void main(String[] args) {

        nextSmaller(IntStream.of(1, 6, 4, 10, 2, 5).toArray());
     //   nextSmaller(IntStream.of(3, 10, 5, 1, 15, 10, 7, 6).toArray());
    }

    static int[] nextSmaller(int a[]) {
        //code here
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && a[i] <= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty())
                result[i] = -1;
            else
                result[i] = stack.peek();
            stack.add(a[i]);
        }
        return result;
    }
}