package com.datastructure.array;

public class SortZeroOne {
    public static void main(String[] args) {

        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int arr_size = arr.length;
        System.out.println("Before after segregation ");
        printArray(arr, arr_size);
        sort012(arr, arr_size);
        System.out.println("Array after segregation ");
        printArray(arr, arr_size);
    }

    private static void sort012(int[] arr, int arr_size) {
        int low = 0, high = arr_size - 1;
        int temp = 0, mid = 0;
        while (mid <= high) {

            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    System.out.println("temp:"+temp+"\t low:"+low+"\t mid:"+mid+"\t high:"+high);
                    low++;
                    mid++;

                    break;
                case 1:
                    System.out.println("temp:"+temp+"\t low:"+low+"\t mid:"+mid+"\t high:"+high);
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    System.out.println("temp:"+temp+"\t low:"+low+"\t mid:"+mid+"\t high:"+high);
                    high--;
                    break;
            }
           // printArray(arr,arr_size);

        }
    }

    private static void printArray(int[] arr, int arr_size) {
        System.out.println();

        for (int i : arr) {
            System.out.print(i + " ,");
        }
        System.out.println();

    }
}
