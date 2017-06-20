package com.tmq.designpattern.creational.singleton;

/**
 * Created by quytm on 6/20/2017.
 */
public class MainSingleton {
    public static void main(String[] args) {
        EagerSingleton.getInstance().printCache();

        StaticBlockSingleton.getInstance().printCache();

        LazyInitializedSingleton.getInstance().printCache();

        ThreadSafeSingleton.getInstance().printCache();
        ThreadSafeSingleton.getInstanceUsingDoubleLocking().printCache();


    }
}
