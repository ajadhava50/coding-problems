package com.corejava.thread.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExample {
    Lock lockA = new ReentrantLock();
    Lock lockB = new ReentrantLock();

    public void execute(){
        new Thread(this::m1,"t1").start();
        new Thread(this::m2,"T2").start();

    }
    public void m1(){
        System.out.println(Thread.currentThread().getName());
        lockA.lock();
        // process resources A
        lockB.lock();
        // process resources B and A

        lockB.unlock();
        lockA.unlock();
    }

    public void m2(){
        System.out.println(Thread.currentThread().getName());
        lockB.lock();
       // process resources B
        lockA.lock();
    // process resources B and A

        lockA.unlock();

        lockB.unlock();
    }

    public static void main(String[] args) {
        new DeadlockExample().execute();
    }
}


