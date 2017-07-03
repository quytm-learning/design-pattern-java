package com.tmq.designpattern.structural.practice.facade;

import com.tmq.designpattern.structural.practice.adapter.model.Language;

/**
 * Created by quytm on 7/3/2017.
 */
public class Translator {

    private String speech;

    public void hearing(String speech) {
        this.speech = speech;
    }

    public String translate(Language languageOut) {
        String englishWord = "???";
        switch (speech) {
            case "bong rua":
            case "xin chao":
            case "hello":
            case "alo":
                englishWord = "hello";
        }

        if (englishWord.equalsIgnoreCase("hello")) {
            switch (languageOut) {
                case EN:
                    return "hello";
                case VI:
                    return "xin chao";
                case FR:
                    return "bong rua";
                case SP:
                    return "alo";
                default:
                    return "???";
            }
        }
        return "???";
    }
}
