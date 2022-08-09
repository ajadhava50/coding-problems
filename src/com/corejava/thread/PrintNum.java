package com.corejava.thread;

public class PrintNum implements Runnable{
    private int num;

    public PrintNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            System.out.println(i+", ");
        }
    }
}
