package com.tmq.designpattern.behavior.visitor.models;

import com.tmq.designpattern.behavior.visitor.ShoppingCartVisitor;

/**
 * Created by quytm on 7/7/2017.
 */
public class Fruit implements ItemElement {

    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int priceKg, int wt, String nm) {
        this.pricePerKg = priceKg;
        this.weight = wt;
        this.name = nm;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }


    public int getWeight() {
        return weight;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}