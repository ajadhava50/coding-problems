package com.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DetectCycleInGraphDFS {
    public static void main(String[] args) {
        isCycle(5, null);
    }

    public static boolean isCycle(int v, List<List<Integer>> adj) {
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (dfs(i, adj, -1, visited)) return true;
            }
        }
        return false;
    }

    private static boolean dfs(int src, List<List<Integer>> adj, int parent, boolean[] visited) {
        visited[src] = true;
        for (int node : adj.get(src)) {
            if (visited[node] == false) {
                if (dfs(node, adj, src, visited) == true) return true;

            } else if (node != parent) {
                return true;
            }
        }
        return false;
    }


}
