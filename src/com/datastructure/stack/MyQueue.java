package com.datastructure.stack;

import java.util.Stack;

class MyQueue {
    Stack<Integer> input_list;
    Stack<Integer> output_list;


    public MyQueue() {
        this.input_list = new Stack<>();
        this.input_list = new Stack<>();
    }

    public void push(int x) {
        input_list.add(x);
    }

    public int pop() {
        if (output_list.empty()) {
            while (!input_list.empty()) {
                output_list.add(input_list.pop());
            }
        }
        return output_list.pop();
    }

    public int peek() {
        return input_list.peek();
    }

    public boolean empty() {
        return input_list.empty() && output_list.empty();
    }

    public static void main(String[] args) {

    }
}