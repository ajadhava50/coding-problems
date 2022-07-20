package com.corejava.thread.deadlock;

public class PrintEvenOdd {

    private int max_count;
    private int number=1;

    PrintEvenOdd(int count){
        max_count=count;

    }

    public void  printOdd(){
        synchronized (this) {
            while (number < max_count) {
                while (number % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println(Thread.currentThread().getName() + ":" + number++);
                notifyAll();
            }
        }
    }

    public void printEven(){
        synchronized (this) {
            while (number < max_count) {
                while (number % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println(Thread.currentThread().getName() + ":" + number++);
                notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        PrintEvenOdd printEvenOdd =new PrintEvenOdd(20);
        Thread Odd=new Thread(()->{
          printEvenOdd.printOdd();
        },"Thread1");
        Odd.start();
        Thread even=new Thread(()->{
          printEvenOdd.printEven();
        },"Thread2");
        even.start();
    }
}
