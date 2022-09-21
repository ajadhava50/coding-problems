package com.datastructure.graph;

import java.util.ArrayList;
import java.util.Stack;

//Function to return list containing vertices in Topological order.
class TopologicalSort {

    public static void main(String[] args) {

    }

    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        // add your code here
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i])
                dfs(i, adj, visited, stack);
        }
        int result[] = new int[V];
        int i = 0;
        while (!stack.isEmpty()) {
            result[i++] = stack.pop();
        }
        return result;
    }

    private static void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;
        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor])
                dfs(neighbor, adj, visited, stack);
        }
        stack.push(v);
    }
}