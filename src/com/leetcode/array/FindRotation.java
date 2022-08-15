package com.leetcode.array;

class FindRotation {


    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};
        findRotation(mat, target);
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isSame(mat, target))
                return true;
            mat = rotate(mat);
        }
        System.out.println("false");
        return false;
    }


    private static int[][] rotate(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int rotated[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               int temp = mat[i][j];
                mat[i][j] = mat[col - 1 - i][j];
            }
        }
        return rotated;
    }

    private static boolean isSame(int[][] mat, int[][] target) {
        if (mat.length != target.length || mat[0].length != target[0].length)
            return false;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }
}