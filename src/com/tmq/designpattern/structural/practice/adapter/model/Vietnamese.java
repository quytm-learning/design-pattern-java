package com.tmq.designpattern.structural.practice.adapter.model;

/**
 * Created by quytm on 6/30/2017.
 */
public class Vietnamese extends Person {

    public Vietnamese() {
        this.language = Language.VI;
    }

    @Override
    public String sayHello() {
        return "xin chao";
    }

    @Override
    public String sayHello(String speech) {
        if (speech.equalsIgnoreCase("xin chao")) return "xin chao";

        return "???";
    }

}
