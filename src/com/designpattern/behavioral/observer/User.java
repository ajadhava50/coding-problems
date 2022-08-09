package com.designpattern.behavioral.observer;


public class User extends Subscriber {
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void notify(String msg) {
        System.out.println("received msg for User:" + name + " Message:" + msg);
    }
}
