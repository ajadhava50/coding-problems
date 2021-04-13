package com.corejava.thread.sequence;

public class SequenceGeneratorTest {

    public static void main(String[] args) {
        SequenceGenerator sequenceGenerator=new SequenceGenerator(20,3);
        new Thread(()->{
            sequenceGenerator.printNumber(1);
        },"Thread1").start();
        new Thread(()->{
            sequenceGenerator.printNumber(2);
        },"Thread2").start();
        new Thread(()->{
            sequenceGenerator.printNumber(0);
        },"Thread3").start();
    }}
