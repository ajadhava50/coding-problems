package com.datastructure.linklist;

public class ListDeleteNode {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
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
    private void deleteNode(Node node, Node n) {


        // When node to be deleted is head node
        if (node == n) {
            if (node.next == null) {
                System.out.println("There is only one node. The list "
                        + "can't be made empty ");
                return;
            }
            node.data=node.next.data;
            n = node.next;
            node.next = node.next.next;

            return;
        }

        // When node to be deleted is not head node

        // traverse till the node which you want to delete
        Node temp = node;
        while (temp != null && temp.next != n){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("given node is not present at list");
        }
        //  delete the node
        temp.next = temp.next.next;
        System.gc();
        return;


    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListDeleteNode list = new ListDeleteNode();
        list.head = new Node(12);
        list.head.next = new Node(15);
        list.head.next.next = new Node(10);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next.next.next = new Node(3);

        System.out.println("Given Linked List :");
        list.printList();
        System.out.println("");

        // Let us delete the node with value 10
        System.out.println("Deleting node :" + head.next.next.data);
        list.deleteNode(head, head.next.next);

        System.out.println("Modified Linked list :");
        list.printList();
        System.out.println("");

        // Lets delete the first node
        System.out.println("Deleting first Node");
        list.deleteNode(head, head);
        System.out.println("Modified Linked List");
        list.printList();

    }



}
