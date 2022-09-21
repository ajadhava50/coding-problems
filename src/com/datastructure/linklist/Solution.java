package com.datastructure.linklist;
import java.util.Stack;

//430. Flatten a Multilevel Doubly Linked List


public class Solution {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
    public static void main(String[] args) {
    }

    public Node flatten(Node head) {
        System.out.println();
        Stack<Node> stack = new Stack();
        Node newHead = head;
        while (newHead != null && newHead.next != null) {
            if (newHead.child != null) {
                stack.add(newHead.next);
                newHead.next.prev = null;
                newHead.next = newHead.child;
                newHead.child.prev = newHead;
                newHead.child = null;
                newHead = newHead.next;
                continue;
            }
            newHead = newHead.next;
        }
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            while (temp != null) {
                newHead.next = temp;
                temp.prev = newHead;
                newHead = newHead.next;
                temp = temp.next;
            }
        }
        return head;
    }
}