package com.tmq.designpattern.behavior.observer;

/**
 * Created by quytm on 7/3/2017.
 */
public class MyTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if (message == null) {
            System.out.println(name + ": no message");
        }

        System.out.println(name + ": message = " + message);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
