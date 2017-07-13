package com.tmq.designpattern.behavior.observer;

/**
 * Created by quytm on 6/28/2017.
 */
public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

    Object getUpdate(Observer observer);

}
