package com.corejava.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintCharNumDemo {

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        executorService.submit(new PrintChar('a',100));
        executorService.submit(new PrintChar('a',100));
        executorService.submit(new PrintNum(100));

        executorService.shutdown();
        System.out.println("\n Main Thread Ends");
    }
}
