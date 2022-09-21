package com.datastructure.linklist;

//138. Copy List with Random Pointer
public class CopyListRandomPointer {
    class Node {
        int val;
        Node next;
        com.datastructure.linklist.Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        //Inserting new Node in between
        Node current = head;
        while (current != null) {
            Node temp = current.next;
            current.next = new Node(current.val);
            current.next.next = temp;
            current = temp;
        }
        current = head;
        //Setting random pointer
        while (current != null) {
            if (current.next != null)
                current.next.random = current.random != null ? current.random.next : null;
            current = current.next.next;
        }
        //Separating original and copy List
        Node original = head, copy = head.next, temp = head.next;
        while (original != null) {
            original.next = original.next.next;
            copy.next = copy.next != null ? copy.next.next : copy.next;
            original = original.next;
            copy = copy.next;
        }
        return temp;
    }

    public static void main(String[] args) {

    }
}
