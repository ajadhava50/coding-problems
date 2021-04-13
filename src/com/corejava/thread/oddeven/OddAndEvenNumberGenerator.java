package com.corejava.thread.oddeven;

public class OddAndEvenNumberGenerator {
    private int maxCount;
    private boolean evenFlag = false;
    private int number = 1;

    public OddAndEvenNumberGenerator(int maxCount) {
        this.maxCount = maxCount;
    }

    public void printOddNumber() {
        synchronized (this) {
            while (number < maxCount) {
                while (evenFlag) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ":" + number++);
                evenFlag = true;
                notifyAll();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            while (number < maxCount) {
                while (!evenFlag) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ":" + number++);
                evenFlag = false;
                notifyAll();
            }
        }
    }


}
