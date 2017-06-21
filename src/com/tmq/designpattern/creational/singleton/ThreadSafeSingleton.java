package com.tmq.designpattern.creational.singleton;

/**
 * Created by quytm on 6/20/2017.
 */
public class ThreadSafeSingleton {

    private String cache;

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        this.cache = "cache: className = ThreadSafeSingleton";
    }

    public synchronized static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }

    public synchronized void printCache(int index) {
        cache += ("_" + index);
        System.out.println(cache);
    }
}
