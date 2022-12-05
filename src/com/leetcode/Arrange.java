package com.leetcode;

class Arrange
{

    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    static void arrange(long arr[], int n)
    {
        //5, 0, 3, 7, 1, 4, 6, 2
        for (int i = 0; i < n; i++) {
            int x = (int) arr[i];
            int y = (int) arr[x];
            arr[i] = x + (y % n) * n;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
    }
}