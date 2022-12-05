package com.grind75.week5;

public class LowestCommonAncestor {

    public class TreeNode {
        public int val;
      public TreeNode left;
      public TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left==null)return right;
        if(right==null)return left;
        return root;
    }
}
