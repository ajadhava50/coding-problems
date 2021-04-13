package com.corejava.thread;

import java.util.concurrent.*;

public class serviceOne {

    public static void main(String[] args) throws InterruptedException {

         ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future future = executorService.submit((Callable) () -> {
            System.out.println("service One");
            return true;
        });

        Future future1 = executorService.submit((Callable) () -> {
            System.out.println("service two");
            return false;
        });

        try {
            boolean f1= (boolean) future.get();
            boolean f2= (boolean) future1.get();
                if(f1 && f2){
                    System.out.println("service three");
                }
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
