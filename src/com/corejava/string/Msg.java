package com.corejava.string;

import com.sun.source.tree.SynchronizedTree;

import java.util.Iterator;
import java.util.TreeSet;

public class Msg implements Runnable {
    private String name;

    public Msg(String name) {
        this.name = name;
    }

    private synchronized void  m1(int n) {
        System.out.println(name+"-"+n+" ");

    }

    @Override
    public void run() {
        System.out.println("====================================================================");
        m1(1);
        m1(2);
        System.out.println("====================================================================");
    }
    public static void decrease(int n){
        if(n>=0){
            decrease(n-1);
        }
        System.out.println("Number:"+n);
    }
    public static void main(String[] args) {
       /* for (int i = 0; i <2 ; i++) {
            new Thread(new Msg("Wallace")).start();
            new Thread(new Msg("Gromit")).start();
        }*/
     /*  Thread tt =new Thread(new AA());
        tt.run();
        tt.run();
        tt.start();*/
        decrease(2);

        AAA aaa=new AAA();
        AAA aa1=new AAA();
        aaa.name="Coffee";
        aa1.name="Tea";

        TreeSet set=new TreeSet();
        set.add(aaa);
        set.add(aa1);
        System.out.println(set.size());
   //     System.out.println(set);
      // set.forEach(e->System.out.println(e.toString()));
        Iterator<AAA> iterator=set.iterator();
        while (iterator.hasNext()){
            AAA aa=iterator.next();
            System.out.println(aa.name);
        }
    }
}

class  AAA implements Comparable {

    public String name;
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "AAA{" +
                "name='" + name + '\'' +
                '}';
    }
}

class  AA implements Runnable {

    @Override
    public void run() {
        System.out.println("runnn");
    }
}