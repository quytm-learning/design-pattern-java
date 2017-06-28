package com.tmq.designpattern.behavior.observer;

/**
 * Created by quytm on 6/28/2017.
 */
public interface Observer {

    void update();

    void setSubject(Subject subject);
}
