package com.datastructure.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

//User function Template for Java
//Input:  arr[] = {1, 6, 4, 10, 2, 5}
//        Output:         {-1, -1, 6, -1, 10, 10}
class LeftGreater {
    public static void main(String[] args) {
        leftGreater(IntStream.of(1, 6, 4, 10, 2, 5).toArray());
    }

    static List<Integer> leftGreater(int a[]) {
        //code here
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            while (!stack.isEmpty() && a[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty())
                result.add(-1);
            else
                result.add(stack.peek());
            stack.add(a[i]);
        }
        System.out.println(result);
        return result;
    }
}