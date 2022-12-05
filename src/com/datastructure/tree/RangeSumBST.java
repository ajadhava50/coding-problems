package com.datastructure.tree;

import java.util.Stack;

class RangeSumBST {

    public int rangeSumBST(TreeNode root, int L, int R) {
        int range_sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val >= L && node.val <= R) {
                range_sum += node.val;
            }
            if (node.val > L && node.left != null) {
                stack.push(node.left);
            }
            if (node.val < R && node.right != null) {
                stack.push(node.right);
            }
        }
        return range_sum;
    }

    int range1_sum = 0;

    public void rangeSumBSTWithRec(TreeNode node, int L, int R) {
        if (node != null) {
            if (node.val >= L && node.val <= R) {
                range1_sum += node.val;
            }
            if (node.val > L && node.left != null) {
                rangeSumBSTWithRec(node.left, L, R);
            }
            if (node.val < R && node.right != null) {
                rangeSumBSTWithRec(node.right, L, R);
            }
        }
    }
}
