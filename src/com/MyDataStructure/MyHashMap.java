package com.MyDataStructure;

import java.util.LinkedList;
import java.util.List;

class MyHashMap<T, R> {
    List<Entry> map[];
    private static int SIZE = 769;

    public MyHashMap() {
        map = new LinkedList[SIZE];

    }

    public void put(T key, T value) {

        int bucket = key.hashCode() % SIZE;
        if (map[bucket] == null) {
            List<Entry> list = new LinkedList<>();
            list.add(new Entry(key, value));
            map[bucket] = list;
        } else {
            for (Entry entry : map[bucket]) {
                if (entry.key == key) {
                    entry.value = value;
                    return;
                }
            }
            map[bucket].add(new Entry(key, value));
        }
    }

    public R get(T key) {
        int bucket = key.hashCode() % SIZE;
        List<Entry> entries = map[bucket];
        if (entries == null) return null;
        for (Entry entry : entries) {
            if (entry.key.equals(key)) return (R) entry.value;
        }
        return null;
    }

    public void remove(T key) {
        int bucket = key.hashCode() % SIZE;
        Entry toRemove = null;
        if (map[bucket] == null) return;
        else {
            for (Entry entry : map[bucket]) {
                if (entry.key.equals(key)) {
                    toRemove = entry;
                }
            }
        }
        if (toRemove == null) return;
        map[bucket].remove(toRemove);

    }
}

class Entry<T, R> {
    public T key;
    public R value;

    public Entry(T key, R value) {
        this.key = key;
        this.value = value;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
