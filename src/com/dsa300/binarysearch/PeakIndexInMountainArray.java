package com.dsa300.binarysearch;
//852. Peak Index in a Mountain Array
class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        while (arr[i] < arr[i + 1]) i++;
        return i;

    }
}