package com.java8;

public class DefaultImp implements TestDefault{

    @Override
    public String name() {

        return "hi";
    }
   /* @Override
    public String name1(String name) {
        return "Hello"+name;
    }*/

    public static void main(String[] args) {

       TestDefault t= new DefaultImp() ;
        System.out.println(t.name1("Abhijeet"));
    }

}

