package com.datastructure.tree;

//110. Balanced Binary Tree
class HeightBalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return false;
        return height(root) != -1;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        int left_height = height(root.left);
        int right_height = height(root.right);
        int balance_factor = Math.abs(left_height - right_height);
        if (balance_factor > 1 || left_height == -1 || right_height == -1) return -1;
        return 1 + Math.max(left_height, right_height);
    }
}