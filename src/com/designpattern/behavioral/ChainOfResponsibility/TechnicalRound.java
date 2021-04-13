package com.designpattern.behavioral.ChainOfResponsibility;
public class TechnicalRound extends Round {

    @Override
    boolean hire(Candidate candidate) {
        if(candidate.getName().equalsIgnoreCase("abhi") && getNext()!=null) {
            System.out.println("cleared technical");
            return getNext().hire(candidate);
        }
        else {
            System.out.println(candidate.getName()+" failed in technical");
            return false;
        }
    }
}
