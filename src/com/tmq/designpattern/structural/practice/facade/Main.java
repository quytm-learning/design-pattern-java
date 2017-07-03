package com.tmq.designpattern.structural.practice.facade;

import com.tmq.designpattern.structural.practice.adapter.model.French;
import com.tmq.designpattern.structural.practice.adapter.model.Spanish;
import com.tmq.designpattern.structural.practice.adapter.model.Vietnamese;

/**
 * Created by quytm on 7/3/2017.
 */
public class Main {

    public static void main(String[] args) {
        Translator translator = new Translator();

        Vietnamese vietnamese = new Vietnamese();
        String say = vietnamese.sayHello();
        System.out.println("Vietnamese say: " + say);

        translator.hearing(say);

        French french = new French();
        String translate = translator.translate(french.getLanguage());
        String rep = french.sayHello(translate);
        System.out.println("French say: " + rep);

        Spanish spanish = new Spanish();
        translate = translator.translate(spanish.getLanguage());
        String repSpanish = spanish.sayHello(translate);
        System.out.println("Spanish say: " + repSpanish);
    }
}
