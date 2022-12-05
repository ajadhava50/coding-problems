package com.grind75;


class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return null;
        ListNode dummy = new ListNode(-1);
        dummy = head;
        ListNode current = dummy, next = dummy, previous = dummy;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        while (count >= k) {
            current = previous.next;
            next = current.next;
            for (int i = 1; i < k; i++) {
                current.next = next.next;
                next.next = previous.next;
                previous.next = next;
                next = current.next;
            }
            previous = current;

            count = count - k;
        }
    return dummy.next;
    }

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
}