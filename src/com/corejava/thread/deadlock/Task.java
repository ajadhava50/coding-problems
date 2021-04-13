package com.corejava.thread.deadlock;

public class Task implements  Runnable{

    private SharedResource s1;
    private SharedResource s2;

    public Task(SharedResource s1, SharedResource s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run() {
        s1.test1(s2);
    }
}
