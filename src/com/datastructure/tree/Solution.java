package com.datastructure.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//559. Maximum Depth of N-ary Tree
public class Solution {
    private int max_depth = 0;

    //DFS
    public void getMaxDepthDFS(Node root, int depth) {
        if (root == null) return;
        max_depth = Math.max(max_depth, depth);
        for (Node child : root.children) {
            getMaxDepthDFS(child, depth + 1);
        }
    }

    //BFS
    public void getMaxDepthBFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                for (Node child : current.children) {
                    queue.offer(child);
                }
            }
            max_depth++;
        }
    }

    public int maxDepth(Node root) {
        if (root == null) return 0;
        //getMaxDepthBFS(root);
        getMaxDepthDFS(root, 1);

        return max_depth;

    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }
}