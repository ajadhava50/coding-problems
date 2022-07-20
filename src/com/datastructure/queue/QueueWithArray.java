package com.datastructure.queue;
//queue with dynamic array
public class QueueWithArray {
    int a[];
    int capacity;
    int rear;

    QueueWithArray(int capacity) {
        this.capacity = capacity;
        a = new int[capacity];
        rear = -1;
    }

    void enque(int data) {
        if (rear == capacity - 1) {
            int b[] = new int[capacity * a.length];
            capacity = b.length;
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            a = b;
            //return;

        }
        rear++;
        a[rear] = data;
    }

    int dequeue() {
        if (rear == -1) {
            return -1;
        }
        for (int i = 0; i < rear; i++) {
            a[i] = a[i + 1];
        }
        rear--;
        return a[0];
    }

    void printQueue() {
        for (int i = 0; i <= rear; i++) {
            System.out.println(a[i]);
        }
    }


    public static void main(String[] args) {
        QueueWithArray queue = new QueueWithArray(3);

        queue.enque(1);
        queue.enque(2);
        queue.enque(3);
        queue.printQueue();

        queue.dequeue();
        System.out.println("After dqueue");
        queue.printQueue();
        System.out.println("After enqueue");
        queue.enque(10);
        queue.enque(11);
        queue.enque(12);
        queue.printQueue();

    }
}
