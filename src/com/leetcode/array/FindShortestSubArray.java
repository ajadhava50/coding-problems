package com.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class FindShortestSubArray {

    public static void main(String[] args) {
        int length = findShortestSubArray(IntStream.of(1, 2, 2, 3, 1, 4, 2).toArray());
        System.out.println(length);
    }

    public static int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> num_counts=new HashMap();
        Map<Integer,Integer> first_seen=new HashMap();
        int min_length=0;
        int degree=0;
        for(int i=0;i<nums.length;i++){
            first_seen.putIfAbsent(nums[i],i);
            num_counts.put(nums[i],num_counts.getOrDefault(nums[i],0)+1);

            if(num_counts.get(nums[i])> degree){
                degree=num_counts.get(nums[i]);
                min_length=i-first_seen.get(nums[i])+1;
            }else if(num_counts.get(nums[i]) == degree){
                min_length=Math.min(min_length,i-first_seen.get(nums[i])+1);
            }
        }
        return min_length;

    }
}