package com.datastructure.array;

import java.util.*;

public class NextGreatestElement {
        public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

            Stack<Integer> stack = new Stack<>();
            Map<Integer, Integer> map=new HashMap<>();
            for (Integer num: nums2) {
                while (!stack.isEmpty() && stack.peek()<num){
                    map.put(stack.pop(),num);
                }
                stack.add(num);
            }
            for (int i=0; i<nums1.length; i++) {
                nums1[i] = map.getOrDefault(nums2,-1);
            }
            return nums1;
        }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2}; int[] nums2 = {1,3,4,2};
        nextGreaterElement(nums1, nums2);

    }
}
