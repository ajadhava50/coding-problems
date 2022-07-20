package com.datastructure.linklist;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null)
            return null;
        ListNode prev = null;
        ListNode current = head;
        while (left > 0) {
            prev = current;
            current = current.next;
            left--;
            right--;
        }
        ListNode connection = prev;
        ListNode tail = current;
        while (right > 0) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
            right--;
        }
        if (connection != null){
            connection.next=prev;
        }else
            head = prev;

        return head;

    }
}
