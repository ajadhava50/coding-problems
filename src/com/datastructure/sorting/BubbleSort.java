package com.datastructure.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int a[] = {2,7,4,3,1,6};

        int n=a.length;
        for (int aa:a) {
            System.out.print(aa +" -->");
        }
        System.out.println();
        for (int i = 0; i <n-1 ; i++) {

            for (int j = i+1; j <n ; j++) {

                if(a[j] < a[i]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int aa:a) {
            System.out.print(aa +" -->");
        }
    }
}
