package com.datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BFSOfGraph {
    // Function to return Breadth First Traversal of given graph.
    public static void main(String[] args) {
        new BFSOfGraph().bfsOfGraph(5, null);

    }

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList();
        if (adj == null || adj.size() == 0) return list;
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[V];
        queue.add(0);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (visited[current]) continue;
            visited[current] = true;
            list.add(current);
            for (int x : adj.get(current)) {
                if (!visited[x]) {
                    queue.add(x);
                }
            }
        }
        return list;
    }
}