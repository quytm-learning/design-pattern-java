package com.tmq.designpattern.behavior.observer;

/**
 * Created by quytm on 7/3/2017.
 */
public class ObserverTest {

    public static void main(String[] args) {
        MyTopic topic = new MyTopic();

        Observer ob1 = new MyTopicSubscriber("Ob1");
        Observer ob2 = new MyTopicSubscriber("Ob2");
        Observer ob3 = new MyTopicSubscriber("Ob3");

        topic.register(ob1);
        topic.register(ob2);
        topic.register(ob3);

        ob1.setSubject(topic);
        ob2.setSubject(topic);
        ob3.setSubject(topic);

        System.out.println("-------- Observer 1 update: ");
        ob1.update();
        System.out.println("------------------------");

        System.out.println("Topic update :");
        topic.postMessage("new message");
    }
}
