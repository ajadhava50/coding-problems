package com.datastructure.stack;


import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {

        Queue queue1 = new ArrayDeque();
        Queue queue2 = new ArrayDeque();

        int pop() {
           return (int)queue1.poll();
        }

        void push(int data) {
            while (!queue1.isEmpty()) {
                queue2.offer(queue1.poll());
            }
            queue1.offer(data);
            while (!queue2.isEmpty()) {
                queue1.offer(queue2.poll());
            }
        }
        int peek() {
            return (int) queue1.peek();
        }

        public static void main(String[] args) {
            StackUsingQueue stackUsingQueue=new StackUsingQueue();
            stackUsingQueue.push(1);
            stackUsingQueue.push(2);
            stackUsingQueue.push(3);
            System.out.println(stackUsingQueue.pop());
            System.out.println(stackUsingQueue.pop());
        }

    }
