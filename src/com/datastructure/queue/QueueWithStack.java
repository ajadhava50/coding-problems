package com.datastructure.queue;

import java.util.Stack;

public class QueueWithStack {
    Stack s1 = new Stack();
    Stack s2 = new Stack();

    void push(int data) {
        s1.push(data);
    }

    int pop() {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        int result = (Integer) (s2.pop());
        while (s2.empty()) {
            s1.push(s2.pop());
        }
        return result;
    }
    int peek() {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        int result = (Integer) (s2.peek());
        while (s2.empty()) {
            s1.push(s2.pop());
        }
        return result;
    }

    public static void main(String[] args) {
        QueueWithStack queue=new QueueWithStack();
        queue.s1.push(1);
        queue.s1.push(2);
        queue.s1.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }

}
