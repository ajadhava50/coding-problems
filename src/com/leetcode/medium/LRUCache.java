package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

    Node head = new Node();
    Node tail = new Node();
    private int capacity;
    private Map<Integer, Node> node_map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        node_map = new HashMap<>(capacity);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        int result = -1;
        Node node = node_map.get(key);
        if (node != null) {
            result = node.val;
            remove(node);
            add(node);
        }
        return result;
    }

    public void put(int key, int value) {
        Node node = node_map.get(key);
        if (node != null) {
            remove(node);
            node.val = value;
            add(node);
        } else {
            if (node_map.size() == capacity) {
                node_map.remove(tail.prev.key, value);
                remove(tail.prev);
            }
            Node new_node = new Node();
            new_node.key = key;
            new_node.val = value;
            node_map.put(key, new_node);
            add(new_node);
        }
    }

    private void add(Node node) {
        Node head_next = head.next;
        head.next = node;
        node.prev = head;
        node.next = head_next;
        head_next.prev = node;

    }

    private void remove(Node node) {
        Node next_node = node.next;
        Node prev_node = node.prev;
        next_node.prev = prev_node;
        prev_node.next = next_node;

    }

    class Node {
        int key;
        int val;
        Node next;
        Node prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */