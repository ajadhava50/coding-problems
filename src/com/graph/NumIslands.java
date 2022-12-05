package com.graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class NumIslands {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int[][] visited = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1 && visited[i][j] == 0) {
                    count++;
                    bfs(i, j, grid, visited);
                }
            }
        }
        return count;
    }

    private void bfs(int ro, int co, char[][] grid, int[][] visited) {

        visited[ro][co] = 1;
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(ro, co));

        while (!queue.isEmpty()) {
            int row = queue.peek().first;
            int col = queue.peek().second;
            queue.remove();
            for (int delRow = -1; delRow <= 1; delRow++) {
                for (int delCol = -1; delCol <= 1; delCol++) {
                    int nRow = row + delRow;
                    int nCol = col + delCol;
                    if (nRow > 0 || nRow < n || nCol > 0 || nCol < m || visited[nRow][nCol] == 0 || grid[nRow][nCol] == '1') {
                        visited[nRow][nCol] = 1;
                        queue.add(new Pair(nRow, nCol));
                    }
                }
            }
        }
    }
}