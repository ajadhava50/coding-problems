package com.dsa300.tree.easy.medium;

import com.grind75.week5.LowestCommonAncestor.TreeNode;

class IsValidBST {

    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean validate(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        } else if (min >= root.val || max <= root.val) {
            return false;
        } else {
            return validate(root.left, min, root.val) && validate(root.right, root.val, max);
        }
    }
}
