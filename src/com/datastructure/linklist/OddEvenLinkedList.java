package com.datastructure.linklist;

public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode oddNode = head;
        ListNode evenNode = head.next;
        ListNode eveNodeHead = head.next;
        while (evenNode != null && evenNode.next != null) {
            evenNode.next=oddNode.next;
            evenNode=oddNode.next;
            oddNode.next=evenNode.next;
            oddNode=oddNode.next;
        }
        oddNode.next=eveNodeHead;
        return head;

    }

    public static void main(String[] args) {
        oddEvenList(null);
    }
}
