package com.tmq.designpattern.structural.practice.adapter;

import com.tmq.designpattern.structural.practice.adapter.model.French;
import com.tmq.designpattern.structural.practice.adapter.model.Spanish;
import com.tmq.designpattern.structural.practice.adapter.model.Vietnamese;

/**
 * Created by quytm on 6/30/2017.
 */
public class Main {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        Vietnamese vietnamese = new Vietnamese();
        String say = vietnamese.sayHello();
        System.out.println("Vietnamese say: " + say);

        French french = new French();
        String rep = french.sayHello(adapter.translate(say, french));
        System.out.println("French say: " + rep);

        Spanish spanish = new Spanish();
        String repSpanish = spanish.sayHello(adapter.translate(say, spanish));
        System.out.println("Spanish say: " + repSpanish);
    }
}
