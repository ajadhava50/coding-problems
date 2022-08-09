package com.datastructure.linklist;

class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current_node = head;
        while (current_node != null && current_node.next != null) {
            if (current_node.val == current_node.next.val) {
                current_node.next = current_node.next.next;
            } else current_node = current_node.next;
        }
        return head;
    }
}