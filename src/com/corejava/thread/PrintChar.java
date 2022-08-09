package com.corejava.thread;

public class PrintChar implements Runnable {
    private char aChar;
    private int noOfTimes;

    public PrintChar(char aChar, int num) {
        this.aChar = aChar;
        this.noOfTimes = num;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(aChar + ", ");
        }

    }
}
