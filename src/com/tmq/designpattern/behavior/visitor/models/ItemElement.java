package com.tmq.designpattern.behavior.visitor.models;

import com.tmq.designpattern.behavior.visitor.ShoppingCartVisitor;

/**
 * Created by quytm on 7/7/2017.
 */
public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);

}