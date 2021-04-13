package com.designpattern.behavioral.strategy;

public class PayPalPaymentStrategy implements PaymentStrategy{

    private String email;
    private String password;

    public PayPalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid with paypal : "+this.email);
    }
}
