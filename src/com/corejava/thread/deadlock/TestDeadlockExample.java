package com.corejava.thread.deadlock;

public class TestDeadlockExample {
    public static void main(String[] args) {
        final String resource1 = "ratan";
        final String resource2 = "vimal";
        // t1 tries to lock resource1 then resource2
          new Thread(() ->{

            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");

                try { Thread.sleep(100);} catch (Exception e) {}

                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        }, "t1").start();

        new Thread(() ->{
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");

                try { Thread.sleep(100);} catch (Exception e) {}

                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        }, "t2").start();
    }
}
//imple