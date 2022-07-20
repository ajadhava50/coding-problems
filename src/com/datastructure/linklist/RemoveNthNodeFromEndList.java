package com.datastructure.linklist;

public class RemoveNthNodeFromEndList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;

        ListNode slow = dummy_head;
        ListNode fast = dummy_head;
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow = slow.next.next;
        return dummy_head.next;

    }

    public static void main(String[] args) {

    }
}
