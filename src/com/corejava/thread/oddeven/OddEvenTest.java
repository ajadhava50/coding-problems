package com.corejava.thread.oddeven;

public class OddEvenTest {
    private static final int MAX_COUNT = 40;

    public static void main(String[] args) {

        OddAndEvenNumberGenerator generator = new OddAndEvenNumberGenerator(MAX_COUNT);
        /*OddNumberPrinter oddNumberPrinter = new OddNumberPrinter(generator);
        EvenNumberPrinter evenNumberPrinter = new EvenNumberPrinter(generator);
        Thread oddThread = new Thread(oddNumberPrinter, "OddThread");
        Thread evenThread = new Thread(evenNumberPrinter, "EvenThread");

        oddThread.start();
        evenThread.start();*/

       new Thread(()->{
            generator.printOddNumber();
        }, "OddThread").start();

        new Thread(()->{
            generator.printEvenNumber();
        }, "EvenThread").start();
    }
}
