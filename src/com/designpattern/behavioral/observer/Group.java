package com.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<Subscriber> subscribers;

    public Group(String groupName) {
        this.groupName = groupName;
        this.subscribers = new ArrayList<>();
    }
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notify(String msg) {
        for (Subscriber subscribers : subscribers) {
            subscribers.notify(msg);
        }

    }

}
