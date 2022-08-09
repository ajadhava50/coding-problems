package com.interview.questions;

import java.util.Arrays;
import java.util.stream.IntStream;

class SingleNumber {
    public static void main(String[] args) {
        singleNumber(IntStream.of(2,2,4,3,3).toArray());
    }
    public static int singleNumber(int[] nums) {
        int ans=0;
       for(int i=0;i<nums.length;i++){
            ans^=nums[i];
           System.out.println(ans);
        }
        System.out.println(ans);
        return ans;
        
    }
}