package com.graph;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/number-of-provinces/1
class NumProvinces {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adj.get(i).get(j) == 1 && i != j) {
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        int visited[] = new int[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                count++;
                dfs(i, adjList, visited);
            }
        }
        return count;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjList, int[] visited) {
        visited[node] = 1;
        for (Integer it : adjList.get(node)) {
            if (visited[it] == 0) {
                dfs(it, adjList, visited);
            }
        }
    }
}
