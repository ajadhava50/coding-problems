package com.designpattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }
    public void addItem(Item item){
        this.items.add(item);
    }

    public void remove(Item item){
        this.items.remove(item);
    }
    public void pay(PaymentStrategy strategy){
        int amount=calculateTotal();
        strategy.pay(amount);

    }

    private int calculateTotal() {
       return items.stream()
               .mapToInt(it->it.getItemPrice())
               .sum();
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item(12,"10");
        Item item2 = new Item(58,"40");

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PayPalPaymentStrategy("abhi@test.com", "admin"));

        //pay by credit card
        cart.pay(new CCPaymentStrategy("Abhijeet", "123456789123456", "555", "12/20"));
        cart.pay(new UPIPaymentStrategy("Abhijeet@oksbi"));
    }
}
