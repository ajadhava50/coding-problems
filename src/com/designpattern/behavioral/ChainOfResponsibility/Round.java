package com.designpattern.behavioral.ChainOfResponsibility;

public abstract class Round {

    abstract boolean hire(Candidate candidate);
    private Round next;
    public void setNext(Round next) {
        this.next = next;
    }
    public Round getNext() {
        return next;
    }

}
