package com.dsa300.tree.easy.medium;

import com.grind75.week5.LowestCommonAncestor.TreeNode;

import java.util.*;

class DistanceK {
    public void makeParents(TreeNode root, Map<TreeNode, TreeNode> parent_map) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.left != null) {
                parent_map.put(current.left, current);
                queue.offer(current.left);
            }
            if (current.right != null) {
                parent_map.put(current.right, current);
                queue.offer(current.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        Map<TreeNode, TreeNode> parent_map = new HashMap<>();
        makeParents(root, parent_map);
        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(target);
        visited.put(target, true);
        int level = 0;

        while (!queue.isEmpty()) {
            if (level == k) break;
            level++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null && visited.get(current.left) == null) {
                    queue.offer(current.left);
                    visited.put(current.left, true);
                }
                if (current.right != null && visited.get(current.right) == null) {
                    queue.offer(current.right);
                    visited.put(current.right, true);
                }
                TreeNode parent = parent_map.get(current);
                if (parent != null && visited.get(parent) == null) {
                    queue.offer(parent);
                    visited.put(parent, true);
                }
            }
        }
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            result.add(current.val);
        }
        return result;
    }


  //  #1 Prepare parents map
  //  #2 create queue and visited map and target into both
   // #3 iterate over queue till queue is Empty and inside queue aad logic for checking
    //    #left #right and #parent of current node polled from queue and add them again in queue
   // #4 take level variable compare it with K if it equals then break;
   // #5 once break from the above loop add remaining element frm queue to result


//    public void distanceK(TreeNode root, TreeNode target, int k, List<Integer> result) {
//        if (root == null) return;
//
//        if (k == 0) {
//            result.add(root.val);
//        } else {
//            distanceK(root.left, target, k - 1, result);
//            distanceK(root.right, target, k - 1, result);
//        }
//    }
}