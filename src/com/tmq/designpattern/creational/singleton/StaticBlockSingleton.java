package com.tmq.designpattern.creational.singleton;

/**
 * Created by quytm on 6/20/2017.
 */
public class StaticBlockSingleton {

    private String cache;

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
        this.cache = "cache: className = StaticBlockSingleton";
    }

    static {
        instance = new StaticBlockSingleton();
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public void printCache() {
        System.out.println(cache);
    }
}
