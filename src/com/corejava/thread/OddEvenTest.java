package com.corejava.thread;

public class OddEvenTest {

    public static void main(String[] args) {
        OddEvenGenerator generator = new OddEvenGenerator(20);
        new Thread(() -> {
            generator.printEvenNumber();
        }, "EvenThread").start();

        new Thread(() -> {
            generator.printOddNumber();
        }, "OddThread").start();
    }
}
