package com.designpattern.behavioral.ChainOfResponsibility;

public class HRRound extends Round {

    @Override
    boolean hire(Candidate candidate) {
        if(candidate.getName().equalsIgnoreCase("abhi") && this.getNext()==null) {
            System.out.println("cleared HR");
            return true;
        }
        else
            return false;
    }
}
