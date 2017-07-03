package com.tmq.designpattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quytm on 6/28/2017.
 */
public class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;
//    private final Object MUTEX = new Object();

    public MyTopic() {
        observers = new ArrayList<>();
    }


    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null Observer");

        if (!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return message;
    }

    public void postMessage(String message) {
        System.out.println("Message Posted to Topic: " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
