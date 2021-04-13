package com.corejava.thread.sequence;

public class DividebyZero {
    public void m1() throws Exception  {
        System.out.println("parent");
    }

    public static void main(String[] args) {

    }
}
 class DividebyZero1 extends DividebyZero {

    public void m1() throws Exception {
        System.out.println("child");
    }
}
