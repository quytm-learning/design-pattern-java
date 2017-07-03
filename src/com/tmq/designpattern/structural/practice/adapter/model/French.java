package com.tmq.designpattern.structural.practice.adapter.model;

/**
 * Created by quytm on 7/3/2017.
 */
public class French extends Person {

    public French() {
        this.language = Language.FR;
    }

    @Override
    public String sayHello() {
         return "bong rua";
    }

    @Override
    public String sayHello(String speech) {
        if (speech.equalsIgnoreCase("bong rua")) return "bong rua";

        return "???";
    }
}
