package com.grind75.week7;

import java.util.HashMap;
import java.util.Map;

//146. LRU Cache
class LRUCache {
    private int capacity;
    private Node head = new Node();
    private Node tail = new Node();
    private Map<Integer, Node> nodeMap;

    LRUCache(int capacity) {
        this.capacity = capacity;
        nodeMap = new HashMap<>(capacity);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        int result = -1;
        Node node = nodeMap.get(key);
        if (node != null) {
            result = node.val;
            remove(node);
            add(node);
        }
        return result;
    }

    public void put(int key, int val) {
        Node node = nodeMap.get(key);
        if (node != null) {
            remove(node);
            node.val = val;
            add(node);
            nodeMap.put(key, node);
        } else {
            if (nodeMap.size() == capacity) {
                nodeMap.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node();
            newNode.key = key;
            newNode.val = val;
            add(newNode);
            nodeMap.put(key, newNode);
        }
    }

    private void add(Node newNode) {
        Node nextNode = head.next;
        head.next = newNode;
        newNode.prev = head;
        newNode.next = nextNode;
        nextNode.prev = newNode;
    }

    private void remove(Node node) {
        Node next_node = node.next;
        Node prev_node = node.prev;
        next_node.prev = prev_node;
        prev_node.next = next_node;
        //  another way
//        node.next.prev = node.prev;
//        node.prev.next=node.next;
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
