package com.corejava.thread.sequence;

public class SequenceGenerator {
    private int max_sequence;
    private int thread_no;

    private int number = 1;

    public SequenceGenerator(int count, int max_thread) {
        this.max_sequence = count;
        this.thread_no = max_thread;
    }

    public void printNumber(int result) {
        synchronized (this) {
            while (number <= max_sequence) {
                System.out.println("number:"+number +"\tthread_no::"+thread_no+"\tresult::"+result+"\tnumber % thread_no::"+number % thread_no);
                while (number % thread_no != result) {
                    System.out.println("INSIDE WHILE");
                    System.out.println("number:"+number +"\tthread_no::"+thread_no+"\tresult::"+result+"\tnumber % thread_no::"+number % thread_no);
                    System.out.println("INSIDE WHILE");
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
