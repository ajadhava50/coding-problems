package com.dsa300.tree.easy;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int val, com.dsa300.tree.easy.TreeNode left, com.dsa300.tree.easy.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}