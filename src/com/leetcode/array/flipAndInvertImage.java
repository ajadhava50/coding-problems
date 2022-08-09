package com.leetcode.array;
//832. Flipping an Image
class flipAndInvertImage {
    public static void main(String[] args) {

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int low = 0;
            int high = image[i].length - 1;
            while (low <= high) {
                if (image[i][low] == image[i][high]) {
                    image[i][low] = 1 - image[i][low];
                    image[i][high] = image[i][low];
                }
                low++;
                high--;
            }
        }
        return image;
    }
}