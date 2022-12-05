package com.corejava.thread;

public class SequenceNumberGeneratorTest {

    private static final int THREAD_NO = 3;
    private static final int MAX_COUNT = 20;

    public static void main(String[] args) {

        SequenceNumberGenerator sequenceNumberGenerator = new SequenceNumberGenerator(THREAD_NO, MAX_COUNT);

        new Thread(() -> sequenceNumberGenerator.printSequence(1), "Thread1").start();
        new Thread(() -> sequenceNumberGenerator.printSequence(2), "Thread2").start();
        new Thread(() -> sequenceNumberGenerator.printSequence(0), "Thread3").start();


    }
}
