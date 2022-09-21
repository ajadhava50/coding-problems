package com.grind75.week4;

//98. Validate Binary Search Tree
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class ValidBST {

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    public boolean validate(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        } else if (min != null && min >= root.val || max != null && max <= root.val) {
            return false;
        } else {
            return validate(root.left, min, root.val) && validate(root.right, root.val, max);
        }
    }
}
