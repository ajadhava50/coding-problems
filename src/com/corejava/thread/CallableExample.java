package com.corejava.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample implements Callable {

    private int i;

    public CallableExample(int i) {
        this.i = i;
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future future = executorService.submit(new CallableExample(i));
            list.add(future);
        }
        for (Future future:list) {
            try {
                System.out.println(future.get(10000,TimeUnit.MICROSECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                System.out.println("time out exception");
            }
        }
        executorService.shutdown();
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + ":" + i);
        return i + 1;
    }
}
