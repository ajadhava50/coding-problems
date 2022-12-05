package com.grind75.week8;

import java.util.PriorityQueue;

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

class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
                PriorityQueue < Integer > queue = new PriorityQueue();
        for (ListNode node : lists) {
            while (node != null) {
                queue.add(node.val);
                node = node.next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while (!queue.isEmpty()) {
            head.next = new ListNode(queue.remove());
            head = head.next;
        }
        return dummy.next;
    }
}