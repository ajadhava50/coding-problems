package com.corejava.string;

import java.util.ArrayList;
import java.util.List;

class Dervied {

     public final void show(){
        System.out.println("base show");
    }

}
public class Base extends Dervied{

//
//    public void show(){
//        System.out.println("Derived  show");
//    }

    public static void main(String[] args) {
        Dervied d = new Base();
        d.show();

        B b=new B();
        String  ab="as";
      List<String> list=new ArrayList<>();
        System.out.println(b instanceof B);
        System.out.println((b instanceof B) && (!(b instanceof A)));
        System.out.println(b instanceof B && (!(b instanceof C)));
    }
}

class  A{

}

class B extends A{

}

class C extends  B{

}

