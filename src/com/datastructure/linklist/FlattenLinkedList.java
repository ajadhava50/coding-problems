package com.datastructure.linklist;

import java.util.ArrayDeque;
import java.util.Queue;

class Node {
    int data;
    Node next;
    Node down;

    Node(int data) {
        this.data = data;
    }
}

public class FlattenLinkedList {
    Queue<Node> queue = new ArrayDeque<Node>();

    Node flatenList(Node head) {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                current.next = queue.poll();
            }
            if (current.down != null) {
                queue.offer(current.down);
            }
            current = current.next;
        }
        return head;
    }

     Node flatenListWithOutQueue(Node head) {
        if (head == null)
            return null;
        Node current = head;
        Node last = head;
        Node temp = null;

        while (last.next != null) {
            last = last.next;
        }
        while (current != last) {
            if (current.down != null) {
                last.next = current.down;
                temp = current.down;
                while (temp.next != null) {
                    temp = temp.next;
                }
                last = temp;
            }
            current = current.next;
        }
        return head;
    }


    // Utility function to print a linked list
    public static void printFlattenedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Utility function to print a list with `down` and `next` pointers
    public static void printOriginalList(Node head) {
        if (head == null) {
            return;
        }

        System.out.print(" " + head.data + " ");

        if (head.down != null) {
            System.out.print("[");
            printOriginalList(head.down);
            System.out.print("]");
        }

        printOriginalList(head.next);
    }

    public static void main(String[] args) {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        Node thirteen = new Node(13);
        Node fourteen = new Node(14);
        Node fifteen = new Node(15);

        // set head node
        Node head = one;

        // set next pointers
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        six.next = seven;
        seven.next = eight;
        nine.next = ten;
        thirteen.next = fourteen;

        // set down pointers
        one.down = six;
        four.down = nine;
        seven.down = eleven;
        eight.down = twelve;
        nine.down = thirteen;
        twelve.down = fifteen;

        System.out.println("The original list is :");
        printOriginalList(head);
        FlattenLinkedList linkedList = new FlattenLinkedList();
       // Node head1 = linkedList.flatenList(head);
        System.out.println("The Flatten list is :");
        //printFlattenedList(head1);

        System.out.println("flatenListWithOutQueue");
        Node head2 = linkedList.flatenListWithOutQueue(head);
        printFlattenedList(head2);

    }
}
