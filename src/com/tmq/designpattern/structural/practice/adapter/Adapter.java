package com.tmq.designpattern.structural.practice.adapter;

import com.tmq.designpattern.structural.practice.adapter.model.Person;

/**
 * Created by quytm on 7/3/2017.
 */
public class Adapter implements BaseAdapter {

    @Override
    public String translate(String speech, Person person) {
        String englishWord = "???";
        switch (speech) {
            case "xin chao":
            case "bong rua":
            case "hello":
            case "alo":
                englishWord = "hello";
        }

        if (englishWord.equalsIgnoreCase("hello")) {
            switch (person.getLanguage()) {
                case EN:
                    return "hello";
                case FR:
                    return "bong rua";
                case VI:
                    return "xin chao";
                case SP:
                    return "alo";
                default:
                    return "???";
            }
        }
        return "???";
    }
}
