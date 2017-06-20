package com.tmq.designpattern.creational.singleton;

/**
 * Created by quytm on 6/20/2017.
 */
public class MainSingleton {
    public static void main(String[] args) {
//        EagerSingleton.getInstance().printCache();
//
//        StaticBlockSingleton.getInstance().printCache();


//        ThreadSafeSingleton.getInstance().printCache(0);
//        ThreadSafeSingleton.getInstanceUsingDoubleLocking().printCache(0);


//        testLazyInitializedSingleton();
        testThreadSafeSingletonNormal();
//        testThreadSafeSingletonUsingDoubleLocking();
    }

    private static void testLazyInitializedSingleton() {
        for (int i = 0; i < 10; i++) {
            int index = i;
            new Thread(() -> LazyInitializedSingleton.getInstance().printCache(index)).start();
        }
    }

    private static void testThreadSafeSingletonNormal() {
        for (int i = 0; i < 10; i++) {
            int index = i;
            new Thread(() -> ThreadSafeSingleton.getInstance().printCache(index)).start();
        }
    }

    private static void testThreadSafeSingletonUsingDoubleLocking() {
        for (int i = 0; i < 10; i++) {
            int index = i;
            new Thread(() -> ThreadSafeSingleton.getInstance().printCache(index)).start();
        }
    }
}
