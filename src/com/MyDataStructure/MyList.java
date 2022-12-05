package com.MyDataStructure;

public class MyList<T> {

    private static int SIZE = 10;
    private static int CURRENT_INDEX = 0;
    private static int REMOVED_COUNT = 0;
    private Object[] list;

    public MyList() {
        list = new Object[SIZE];
    }

    public T get(int index) {
        if (index < 0 || index >= SIZE) return null;
        return (T) list[index];
    }

    public void add(T val) {
        if (CURRENT_INDEX < SIZE) {
            list[CURRENT_INDEX++] = val;
        } else if (CURRENT_INDEX >= SIZE) {
            SIZE = SIZE + SIZE / 2;
            Object[] newList = new Object[SIZE];
            copyElement(list, newList);
            list = newList;
            list[CURRENT_INDEX++] = val;
            newList = null;
        }
    }

    public boolean remove(int index) {
        if (index < 0 || index >= SIZE) throw new IndexOutOfBoundsException();
        for (int i = index; i < CURRENT_INDEX - 1; i++) {
            list[i] = list[i + 1];
        }
        list[--CURRENT_INDEX] = 0;
        return true;
    }

    public int size() {
        return CURRENT_INDEX;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(list[i]);
            if (i != SIZE)
                System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }

    private void copyElement(Object[] list, Object[] newList) {
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
    }

    public static void main(String[] args) {
        MyList<String> list = new MyList();
        //  list.add("xyz");
        for (int i = 0; i < 100; i++) {
            list.add("XYZ" + i + 1);
        }
        System.out.println(list.size());
        list.print();
        for (int i = 0; i < 200; i++) {
            System.out.println(i + ":::" + list.get(i));
        }
    }
}
