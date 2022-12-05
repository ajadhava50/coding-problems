package com.datastructure.tree;

import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    //Iterative
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        int sum_of_left_leaves = 0;

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    sum_of_left_leaves += node.left.val;
                } else {
                    stack.add(node.left);
                }
            }
            if (node.right != null) {
                if (node.right.left != null || node.right.right != null) {
                    stack.add(node.right);
                }
            }
        }
        return sum_of_left_leaves;
    }
    //recursive
    public int sumOfLeftLeaves1(TreeNode node) {
        if (node == null) return 0;
        int sum_of_left_leaves = 0;

            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    sum_of_left_leaves += node.left.val;
                } else {
                    sum_of_left_leaves += sumOfLeftLeaves1(node.left);
                }
            }
            if (node.right != null) {
                if (node.right.left != null || node.right.right != null) {
                    sum_of_left_leaves += sumOfLeftLeaves1(node.right);
                }
            }
        return sum_of_left_leaves;
    }
}