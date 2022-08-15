package com.corejava.thread;

public class ThreadJoin implements Runnable {
    int raceConditionValue = 0;

    public static void main(String[] args) throws InterruptedException {
        ThreadJoin threadJoin = new ThreadJoin();
        Thread t1 = new Thread(threadJoin, "Thread1");
        Thread t2 = new Thread(threadJoin, "Thread2");
        Thread t3 = new Thread(threadJoin, "Thread3");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":::" + i);
            raceConditionValue = raceConditionValue + i;

        }
    }
}

