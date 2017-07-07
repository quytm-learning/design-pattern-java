package com.tmq.designpattern.behavior.visitor;

import com.tmq.designpattern.behavior.visitor.models.Book;
import com.tmq.designpattern.behavior.visitor.models.Fruit;
import com.tmq.designpattern.behavior.visitor.models.ItemElement;

/**
 * Created by quytm on 7/7/2017.
 */
public class ShoppingCartClient {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
                new Book(20, "1234"), new Book(100, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")
        };

        int total = calculatePrice(items);

        System.out.println("Total Cost = " + total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}