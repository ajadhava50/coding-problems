package com.dsa300.tree.easy.medium;

import com.grind75.week5.LowestCommonAncestor.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> current_level_list = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                int index = leftToRight ? i : size - 1 - i;
                if(leftToRight)
                    current_level_list.add(index, current.val);
                else
                    current_level_list.add(0, current.val);//Add element to 0th index and shift the exsisting element to right

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            leftToRight = !leftToRight;
            result.add(current_level_list);
        }
        return result;
    }
}