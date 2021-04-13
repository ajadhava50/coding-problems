package com.corejava.thread.deadlock;

public class EvenOddTest {

    private int max_number;
    private volatile int number = 1;

    EvenOddTest(int max_number) {
        this.max_number = max_number;
    }

    public void printEvenNumber() {

        synchronized (this) {
            while (number < max_number) {
                while (number %2 !=0) {

                    try {
                        wait();
                    } catch (InterruptedException ex) {

                    }
                }
                System.out.println(Thread.currentThread().getName() + "::" + number++);
                notifyAll();
            }
        }
    }

    public void printOddNumber() {

        synchronized (this) {
            while (number < max_number) {
                while (number %2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException ex) {

                    }
                }
                System.out.println(Thread.currentThread().getName() + "::" + number++);
                notifyAll();
            }

        }
    }


    public static void main(String[] args) {

        EvenOddTest test = new EvenOddTest(20);
        Thread oddThread = new Thread(() -> {
            test.printOddNumber();
        }, "odd");
        oddThread.start();

        Thread evenThread = new Thread(() -> {
            test.printEvenNumber();
        }, "even");

        evenThread.start();
    }

}