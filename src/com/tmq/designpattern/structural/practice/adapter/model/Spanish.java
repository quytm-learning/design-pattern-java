package com.tmq.designpattern.structural.practice.adapter.model;

/**
 * Created by quytm on 7/3/2017.
 */
public class Spanish extends Person{

    public Spanish() {
        this.language = Language.SP;
    }

    @Override
    public String sayHello() {
        return "alo";
    }

    @Override
    public String sayHello(String speech) {
        if (speech.equalsIgnoreCase("alo")) return "alo";

        return "???";
    }
}
