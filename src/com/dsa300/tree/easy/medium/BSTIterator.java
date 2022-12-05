package com.dsa300.tree.easy.medium;

import com.grind75.week5.LowestCommonAncestor.TreeNode;

import java.util.Stack;

class BSTIterator {

    private Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    private void pushAll(TreeNode root) {
        while (root != null) {
            stack.add(root);
            root = root.left;
        }
    }
    public int next() {
        TreeNode top = stack.pop();
        pushAll(top.right);
        return top.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
