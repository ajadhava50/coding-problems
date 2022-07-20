package com.leetcode;

import java.util.Stack;

public class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack();
        for (String token : tokens) {
            if(!"+-*/".contains(token))
                stack.push(token);
            else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch (token) {
                    case "+":
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(b-a));
                        break;
                    case "*":
                        stack.push(String.valueOf(a*b));
                        break;
                    case "/":
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }
        return Integer.valueOf(stack.pop());
    }

    public static void main(String[] args) {
        String [] token={"2","1","+","3","*"};
        System.out.println(evalRPN(token));
    }
}
