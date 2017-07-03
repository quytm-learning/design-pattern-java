package com.tmq.designpattern.structural.practice.adapter.model;

/**
 * Created by quytm on 6/30/2017.
 */
public abstract class Person {

    protected Language language;
    public abstract String sayHello();
    public abstract String sayHello(String speech);

    public Language getLanguage() {
        return language;
    }
}
