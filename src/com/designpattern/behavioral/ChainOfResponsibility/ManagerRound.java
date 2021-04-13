package com.designpattern.behavioral.ChainOfResponsibility;

public class ManagerRound extends Round {

    @Override
    boolean hire(Candidate candidate) {
        if(candidate.getName().equalsIgnoreCase("abhi") && getNext()!=null) {
            System.out.println("cleared ManagerRound");
             return getNext().hire(candidate);
        }
        else
            return false;
    }
}
