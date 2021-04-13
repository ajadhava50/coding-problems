package com.datastructure;

public class ArraySubSet {

     static boolean isSubset( int a[], int b[], int m, int n){
         int j;
         for(int i=0;i<n;i++) {
             for ( j = 0; j < m ; j++) {

                 if(b[i]==a[j])
                     break;
             }
             if (j == m)
                 return false;
         }

        return true;
    }

    public static void main(String[] args) {

        int a[]={11,1,13,21,3,7};
        int b[]={11,3,7,1,9};

        int m =a.length;
        int n=b.length;
        if(isSubset(a,b,m,n))
            System.out.println("true");
        else
            System.out.println("false");

    }
}
