package com.tmq.designpattern.behavior.visitor.models;

import com.tmq.designpattern.behavior.visitor.ShoppingCartVisitor;

/**
 * Created by quytm on 7/7/2017.
 */
public class Book implements ItemElement {

    private int price;
    private String isbnNumber;

    public Book(int cost, String isbn) {
        this.price = cost;
        this.isbnNumber = isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}