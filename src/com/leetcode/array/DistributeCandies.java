package com.leetcode.array;

//1103. Distribute Candies to People
class DistributeCandies {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
//        int i = 0, loops = 0;
//
//        while (candies > 0) {
//            int current_candy = (loops * num_people) + i + 1;
//            if (i == num_people) {
//                loops++;
//                i = 0;
//            }
//            if (candies - current_candy < 0) {
//                result[i] += candies;
//            } else {
//                result[i] += current_candy;
//            }
//            candies -= current_candy;
//            i++;
//
//        }
        for (int i = 0; candies > 0; ++i) {
            result[i % num_people] += Math.min(candies, i + 1);
            candies -= i + 1;
        }
        return result;
    }
}