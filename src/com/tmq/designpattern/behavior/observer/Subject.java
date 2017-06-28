package com.tmq.designpattern.behavior.observer;

/**
 * Created by quytm on 6/28/2017.
 */
public interface Subject {

    //methods to register and unregister observers
    void register(Observer observer);
    void unregister(Observer observer);

    //method to notify observers of change
    void notifyObservers();

    //method to get updates from subject
    Object getUpdate(Observer observer);
}
