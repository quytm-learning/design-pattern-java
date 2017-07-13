package com.tmq.designpattern.behavior.visitor;

import com.tmq.designpattern.behavior.visitor.models.Book;
import com.tmq.designpattern.behavior.visitor.models.Fruit;

/**
 * Created by quytm on 7/7/2017.
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost;
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else cost = book.getPrice();
        System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost = " + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = " + cost);
        return cost;
    }

}