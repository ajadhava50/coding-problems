package com.datastructure.queue;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class QueueWithLinkedList {

    private Node rear, front = null;

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    int dequeue() {
        if (front == null) {
            return -1;
        }
        int result = front.data;
        front = front.next;
        return result;
    }

    void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        QueueWithLinkedList queue = new QueueWithLinkedList();
        for (int i = 1; i < 10; i++) {
            queue.enqueue(i);
        }
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("############################");
        queue.printQueue();

    }
}
