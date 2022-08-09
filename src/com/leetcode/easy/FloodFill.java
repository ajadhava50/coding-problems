package com.leetcode.easy;

class FloodFill {

    public static void main(String[] args) {
        int [][] image={
                {1,1,1},{1,1,0},{1,0,1}
        };
        floodFill(image,1,1,2);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) {
            return image;
        }
        fillImage(image, sr, sc, image[sr][sc], newColor);
        for (int i = 0; i < image.length ; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print("\t"+image[i][j]);
            }
            System.out.println();
        }
        return image;
    }

    private static void fillImage(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sc < 0 || sr > image.length-1 || sc >= image[0].length-1 || image[sr][sc] != color)
            return;
        image[sr][sc] = newColor;
        fillImage(image, sr + 1, sc, color, newColor);
        fillImage(image, sr - 1, sc, color, newColor);
        fillImage(image, sr, sc + 1, color, newColor);
        fillImage(image, sr, sc - 1, color, newColor);
    }
}