package com.datastructure.tree;

//226. Invert Binary Tree
class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode left_tree = invertTree(root.left);
        TreeNode right_tree = invertTree(root.right);
        root.left = right_tree;
        root.right = left_tree;
        return root;
    }
}