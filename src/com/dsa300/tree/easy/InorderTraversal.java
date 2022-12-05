package com.dsa300.tree.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList<Integer> result = new ArrayList<>();
        inorderTraversal(result, root);

        return result;
    }

    private void inorderTraversal(ArrayList<Integer> result, TreeNode root) {
        if (root == null)
            return;
        inorderTraversal(result, root.right);
        result.add(root.val);
        inorderTraversal(result, root.left);
    }
}