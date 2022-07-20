package com.corejava.thread.deadlock;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList();

    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                producerConsumer.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                producerConsumer.remove();
            }
        });
        t1.start();
        t2.start();
    }

    void add (int value) {
        synchronized (this) {
        while (queue.size()==100){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Adding value in queue:"+value);
        queue.add(value);
        notifyAll();
        }
    }

    void remove() {
        synchronized (this) {
            while (queue.isEmpty()) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("removing value from queue:"+queue.poll());
            notifyAll();
        }
    }
}
