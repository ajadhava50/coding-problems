package com.corejava.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task implements Runnable {

    public static void main(String[] args) {
        int count = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        for (int i = 0; i < 100; i++) {
            executorService.execute(new Task());
        }
        System.out.println("main thread exit.");
    }

    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
