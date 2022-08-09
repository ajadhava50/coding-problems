package com.datastructure.tree;


class ISValidBST {
    public boolean isValidBST(Node root) {
        return validate(root, null, null);

    }

    public boolean validate(Node root, Integer max, Integer min) {
        if (root == null) {
            return true;
        } else if (min != null && min >= root.data || max != null && max <= root.data) {
            return false;
        } else {
            return validate(root.left, root.data, min) && validate(root.right, max, root.data);
        }

    }
}