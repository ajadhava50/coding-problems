package com.corejava.thread;

public class SequenceNumberGenerator {
    private int number=1;
    private int threadNo;
    private int maxCount;

    public SequenceNumberGenerator(int threadNo, int maxCount) {
        this.threadNo = threadNo;
        this.maxCount = maxCount;
    }

    public void printSequence(int result) {
        synchronized (this){
            while(number<maxCount){
                while(number%threadNo!=result){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+":"+number++);
                notifyAll();
            }
        }
    }
}
