package com.datastructure.linklist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IntSummaryStatistics;

public class ListUnionIntersection {

    Node head;

    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int value) {
        head = InsertNode(head,value);

    }

    private Node InsertNode(Node head, int value) {

        if(head == null)
            head = new Node(value);
        else
            head.next = InsertNode(head.next,value);

        return head;
    }

    public ListUnionIntersection union(Node head1,Node head2) {

        ListUnionIntersection result = new ListUnionIntersection();
        Node node1 = head1;
        Node node2 = head2;
        while (node1 != null) {
            result.add(node1.data);
            node1 = node1.next;
        }
        while (node2 != null) {
            if (!isPresent(head1, node2.data))
                result.add(node2.data);

            node2 = node2.next;
        }
        return result;
    }

    public boolean isPresent(Node node,int data) {

        Node temp = node;
        while (temp != null) {
            if (temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public ListUnionIntersection intersection(Node node1,Node node2) {

        ListUnionIntersection result = new ListUnionIntersection();

        while (node2 != null) {
            if (isPresent(node1, node2.data))
                result.add(node2.data);
            node2 = node2.next;
        }


        return result;
    }
   public static void main(String[] args) {

       ListUnionIntersection list1 = new ListUnionIntersection();

       list1.add(10);
       list1.add(11);
       list1.add(12);
       list1.add(13);
       System.out.print("List 1:");
       list1.printList();

       ListUnionIntersection list2 = new ListUnionIntersection();

       list2.add(14);
       list2.add(13);
       list2.add(15);
       list2.add(16);

       System.out.print("List 2:");
       list2.printList();

       ListUnionIntersection listUnion = new ListUnionIntersection();
       ListUnionIntersection listIntersection = new ListUnionIntersection();

       listUnion = listUnion.union(list1.head,list2.head);

       System.out.print("Union of L1 and L2:");
       listUnion.printList();

       listIntersection = listIntersection.intersection(list1.head,list2.head);

       System.out.print("intersection of L1 and L2:");
       listIntersection.printList();




   }


}
