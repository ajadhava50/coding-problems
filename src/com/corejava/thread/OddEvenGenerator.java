package com.corejava.thread;

/**
 *
 */
public class OddEvenGenerator {
    private int max_sequence;
    private int number = 2;
//    private boolean even_flag=number%2==0;

    public OddEvenGenerator(int i) {
        this.max_sequence = i;
    }

    public void printEvenNumber() {
        synchronized (this) {
            while (number < max_sequence) {
                while (number % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ":" + number++);
                //              even_flag=false;
                notify();
            }
        }
    }

    public void printOddNumber() {
        synchronized (this) {
            while (number < max_sequence) {
                while (number % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ":" + number++);
                // even_flag=true;
                notify();
            }
        }
    }
}
