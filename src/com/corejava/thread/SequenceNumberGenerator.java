package com.corejava.thread;

public class SequenceNumberGenerator {
    private int number = 1;
    private int threadCount;
    private int maxCount;

    public SequenceNumberGenerator(int threadCount, int maxCount) {
        this.threadCount = threadCount;
        this.maxCount = maxCount;
    }

    public void printSequence(int currentThreadNo) {
        synchronized (this) {
            while (number < maxCount) {
                while (number % threadCount != currentThreadNo) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ":" + number++);
                notifyAll();
            }
        }
    }
}
