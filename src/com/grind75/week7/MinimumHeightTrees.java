package com.grind75.week7;

import java.util.*;

//310. Minimum Height Trees
class MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();
        if (n <= 0) return result;
        if (n == 1) {
            result.add(0);
            return result;
        }
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int[] degree = new int[n];
        for (int[] edge : edges) {
            degree[edge[0]]++;
            degree[edge[1]]++;
            map.putIfAbsent(edge[0], new HashSet<>());
            map.get(edge[0]).add(edge[1]);
            map.putIfAbsent(edge[1], new HashSet<>());
            map.get(edge[1]).add(edge[0]);
        }
        map.forEach((k, v) -> System.out.println(k + "-->" + v));
        Queue<Integer> leaves = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                leaves.offer(i);
            }
        }
        int count = n;
        while (count > 2) {
            int size = leaves.size();
            count = count - size;
            while (size-- > 0) {
                Integer leaf = leaves.poll();
                for (Integer connection : map.get(leaf)) {
                    degree[connection]--;
                    map.get(connection).remove(leaf);
                    if (degree[connection] == 1) {
                        leaves.offer(connection);
                    }
                }
            }
        }
        return new ArrayList<>(leaves);

    }
}