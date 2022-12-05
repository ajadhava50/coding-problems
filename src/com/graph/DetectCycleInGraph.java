package com.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DetectCycleInGraph {
    public static void main(String[] args) {
        isCycle(5, null);
    }

    public static boolean isCycle(int v, List<List<Integer>> adj) {
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (isCyclePresent(i, adj, v, visited)) return true;
            }
        }
        return false;
    }

    private static boolean isCyclePresent(int src, List<List<Integer>> adj, int v, boolean[] visited) {
        visited[src] = true;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(src, -1));
        while (!queue.isEmpty()) {
            int node = queue.peek().first;
            int parent = queue.peek().second;
            queue.remove();
            for (int adjacentNode : adj.get(node)) {
                if (!visited[adjacentNode]) {
                    visited[adjacentNode] = true;
                    queue.add(new Pair(adjacentNode, node));
                } else if (adjacentNode != parent) {
                    return true;
                }
            }
        }
        return false;
    }


}
