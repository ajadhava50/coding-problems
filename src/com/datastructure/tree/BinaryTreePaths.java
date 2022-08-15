package com.datastructure.tree;

import java.util.ArrayList;
import java.util.List;
//257. Binary Tree Paths

class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return null;
        List<String> result = new ArrayList<>();
        String current_path = Integer.toString(root.val);
        if (root.left == null && root.right == null) {
            current_path += root.val;
            result.add(current_path);
        }
        if (root.left != null)
            dfs(root.left, result, current_path);
        if (root.right != null)
            dfs(root.right, result, current_path);
        return result;

    }

    private void dfs(TreeNode root, List<String> result, String current_path) {
        current_path += "->" + root.val;
        if (root.left == null && root.right == null) {
            result.add(current_path);
            return;
        }
        if (root.left != null)
            dfs(root.left, result, current_path);
        if (root.right != null)
            dfs(root.right, result, current_path);
    }

}
