package com.MyDataStructure;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MySet<T> {
    private LinkedList<Entry>[] mybucket;
    private static final Object DUMMY_OBJECT = new Object();
    private static int SIZE = 10;

    public MySet() {
        this.mybucket = new LinkedList[SIZE];
    }

    public boolean contains(T key) {
        int bucket = key.hashCode();
        LinkedList<Entry> entries = mybucket[bucket];
        if (entries == null) {
            return false;
        }
        for (Entry entry : entries) {
            if (entry.key.equals(key)) ;
            return true;
        }
        return false;
    }

    public boolean add(T key) {
        int bucket = key.hashCode();
        LinkedList<Entry> entries = mybucket[bucket];
        if (entries == null) {
            mybucket[bucket] = new LinkedList<>();
            return mybucket[bucket].add(new Entry(key, DUMMY_OBJECT));
        }
        for (Entry entry : entries) {
            if (entry.key.equals(key)) return false;
        }
        return entries.add(new Entry(key, DUMMY_OBJECT));
    }


    class Entry<T> {
        private T key;
        private Object value;

        public Entry(T key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < SIZE; i++) {
            LinkedList<Entry> entries = mybucket[i];
            if (entries != null) {
                for (Entry entry : entries) {
                    if (entry == null) continue;
                    System.out.print(entry.key);
                }
            }
            if (i != SIZE)
                System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            mySet.add(i);
            set.add(i);
        }
//        System.out.println(set);
//        mySet.print();

        System.out.println(mySet.add(3));
        System.out.println(set.add(3));
        //System.out.println(set);
        mySet.print();
        for (int i = 0; i < 5; i++) {
            System.out.println(mySet.contains(i));
            System.out.println(set.contains(1));
        }

    }


}