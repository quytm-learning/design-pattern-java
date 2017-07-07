package com.tmq.designpattern.behavior.visitor;

import com.tmq.designpattern.behavior.visitor.models.Book;
import com.tmq.designpattern.behavior.visitor.models.Fruit;

/**
 * Created by quytm on 7/7/2017.
 */
public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);

}