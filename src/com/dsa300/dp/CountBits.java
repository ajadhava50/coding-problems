package com.dsa300.dp;

class CountBits {
    public int[] countBits(int n) {
        //Brute force
//        int ans[] = new int[n + 1];
//        for (int i = 0; i < n; i++) {
//            int num = i;
//            int count = 0;
//            while (num > 0) {
//                count += num % 2;
//                num = num / 2;
//            }
//            ans[i] = count;
//        }
//        return ans;

        int ans[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                ans[i] = ans[i / 2];
            else
                ans[i] = ans[i / 2] + 1;

        }
        return ans;

//        1 ==     0001
//        2 ==     0010
//        3 ==     0011
//        4 ==     0100
//        5 ==     0101
//        6 ==     0110
//        7 ==     0111
//        8 ==     1000
//        9 ==     1001
//        10 ==    1010
//        11 ==    1011
//        12 ==    1100
//        13 ==    1101
//        14 ==    1110
//        15 ==    1111


    }

}