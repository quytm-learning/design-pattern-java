package com.tmq.designpattern.behavior.strategy.models;

/**
 * Created by quytm on 7/7/2017.
 */
public class Item {

    private String upcCode;
    private int price;

    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

}