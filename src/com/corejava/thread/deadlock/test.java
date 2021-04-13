package com.corejava.thread.deadlock;

public class test {

    public static void main(String[] args) {

        SharedResource s1 = new SharedResource();
        SharedResource s2 = new SharedResource();

        //'Task t1 = new Task();

        new Thread(() ->{

            s1.test1(s2);
        }, "t1").start();

        new Thread(() ->{
            s2.test1(s1);
        }, "t2").start();
    }
}
