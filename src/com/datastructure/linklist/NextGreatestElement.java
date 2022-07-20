package com.datastructure.linklist;
//Leetcode 1019

import java.util.ArrayList;
import java.util.Stack;

public class NextGreatestElement {
    public static int[] nextGreaterElement(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int[] output_array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            while (!stack.isEmpty() && list.get(stack.peek()) < list.get(i)) {
                output_array[stack.pop()] = list.get(i);
            }
            stack.push(i);
        }
        return output_array;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        node.next = node1;
        node1.next = node2;
        nextGreaterElement(node);

    }
}
