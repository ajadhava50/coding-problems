package com.dsa300.tree.easy;

//1448. Count Good Nodes in Binary Tree
class CountGoodNodes {
    int count = 0;

    public int goodNodes(TreeNode root) {
        if (root == null) return count;
        countGoodNodes(root, root.val);
        return count;
    }

    private void countGoodNodes(TreeNode root, int max) {
        if (root == null) return;
        if (root.val >= max) {
            count++;
            max = root.val;
        }
        countGoodNodes(root.left, max);
        countGoodNodes(root.right, max);
    }
}