package com.corejava.thread;

public class Sequence implements Runnable {

    private SequenceNumberGenerator sequenceNumberGenerator;
    private int result;

    public Sequence(SequenceNumberGenerator sequenceNumberGenerator, int result) {
        this.sequenceNumberGenerator = sequenceNumberGenerator;
        this.result = result;
    }

    @Override
    public void run() {
        sequenceNumberGenerator.printSequence(result);
    }
}
