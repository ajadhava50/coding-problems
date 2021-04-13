package com.designpattern.behavioral.strategy;

public class UPIPaymentStrategy implements PaymentStrategy{

    private String upiId;

    public UPIPaymentStrategy(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid with UPI : "+this.upiId);
    }
}
