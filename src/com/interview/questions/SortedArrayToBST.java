package com.interview.questions;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {

        return constructTreeFromArray(nums, 0, nums.length - 1);

    }

    private TreeNode constructTreeFromArray(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(mid);
        node.left = constructTreeFromArray(nums, left, mid);
        node.right = constructTreeFromArray(nums, mid + 1, right);
        return node;
    }
}