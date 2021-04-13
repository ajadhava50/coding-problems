package com.designpattern.behavioral.strategy;

public class Item {
    private int itemPrice;
    private String itemCode;

    public Item(int itemPrice, String itemCode) {
        this.itemPrice = itemPrice;
        this.itemCode = itemCode;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
}
