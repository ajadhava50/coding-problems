package com.designpattern.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        Group group = new Group("dev");
        User user = new User("1", "A");
        User user1 = new User("2", "B");
        User user2 = new User("3", "C");
        group.subscribe(user);
        group.subscribe(user1);
        group.subscribe(user2);
        group.notify("Welcome to the group");
        group.unSubscribe(user2);
        group.notify("second msg");
        group.unSubscribe(user1);
        group.notify("third msg");

    }

}
