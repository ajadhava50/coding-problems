package com.designpattern.behavioral.ChainOfResponsibility;

public class InterviewPannel {
    private Round first;

    public InterviewPannel() {
        TechnicalRound technicalRound = new TechnicalRound();
        ManagerRound managerRound = new ManagerRound();
        HRRound hrRound = new HRRound();
        first=technicalRound;
        technicalRound.setNext(managerRound);
        managerRound.setNext(hrRound);

    }

    private boolean hire(Candidate candidate) {
        return first.hire(candidate);
    }

    public static void main(String[] args) {
        InterviewPannel pannel = new InterviewPannel();
        Candidate candidate = new Candidate("Abhi", 1);
        System.out.println(pannel.hire(candidate));
        Candidate candidate1 = new Candidate("Aadbhi", 1);
        System.out.println(pannel.hire(candidate1));
    }


}
