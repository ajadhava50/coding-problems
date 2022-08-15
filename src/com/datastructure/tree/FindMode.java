package com.datastructure.tree;

import java.util.ArrayList;
import java.util.List;
//501. Find Mode in Binary Search Tree
class FindMode {
    int max = 0;
    int count = 0;
    Integer prev = null;
    public int[] findMode(TreeNode root) {
        if (root == null) return null;
        List<Integer> modes = new ArrayList<>();
        traverse(root, modes);
        int result[] = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        return result;

    }
    private void traverse(TreeNode root, List<Integer> modes) {
        if (root == null) return;
        traverse(root.left, modes);
        if(prev!=null){
            if (prev == root.val) {
                count++;
            } else {
                count = 0;
            }
        }

        if (count > max) {
            max = count;
            modes.clear();
            modes.add(root.val);
        } else if (max == count) {
            modes.add(root.val);
        }
        prev = root.val;
        traverse(root.right, modes);
    }
}