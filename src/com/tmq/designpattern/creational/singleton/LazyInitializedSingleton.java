package com.tmq.designpattern.creational.singleton;

/**
 * Created by quytm on 6/20/2017.
 */
public class LazyInitializedSingleton {

    private String cache;

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
        this.cache = "cache: className = LazyInitializedSingleton";
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }

        return instance;
    }

    public void printCache(int index) {
        cache += ("_" + index);
        System.out.println(cache);
    }
}
