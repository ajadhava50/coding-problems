package com.datastructure.queue;

public class QueueWithCircularArray {
    int a[];
    int capacity;
    int rear = -1;
    int front = -1;

    QueueWithCircularArray(int capacity) {
        this.capacity = capacity;
        a = new int[capacity];
    }

    void enque(int data) {
        if ((rear + 1) % capacity == front) {
            System.out.println("full");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % capacity;
        a[rear] = data;
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("queue is Empty");
            return -1;
        }
        int result = a[front];
        a[front] = 0;
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return result;
    }

    void printQueue() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


    public static void main(String[] args) {
        QueueWithCircularArray queue = new QueueWithCircularArray(3);

        queue.enque(1);
        queue.enque(2);
        queue.enque(3);
        queue.printQueue();
//
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
//        System.out.println("After dqueue");
        queue.printQueue();
//        System.out.println("After enqueue");
//        queue.enque(10);
//        queue.enque(11);
//        queue.enque(12);
//        queue.printQueue();

    }
}
