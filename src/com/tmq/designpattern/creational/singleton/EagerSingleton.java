package com.tmq.designpattern.creational.singleton;

/**
 * Created by quytm on 6/20/2017.
 */
public class EagerSingleton {

    private String cache;

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        this.cache = "cache: className = EagerSingleton";
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void printCache() {
        System.out.println(cache);
    }

}
