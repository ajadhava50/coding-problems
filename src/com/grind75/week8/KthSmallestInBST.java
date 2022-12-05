package com.grind75.week8;
//230. Kth Smallest Element in a BST
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
class KthSmallestInBST {
    int count=0;
    int smallest=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
            return 0;
        count=k;
        helper(root);
        return smallest;
        }
    public void helper(TreeNode root) {
        if(root.left != null)
        helper(root.left);
        count--;  
        if(count==0){
            smallest=root.val;
            return;
        }
        if (root.right != null) helper(root.right);
    }
}