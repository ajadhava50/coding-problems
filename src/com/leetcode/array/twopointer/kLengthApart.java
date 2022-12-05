package com.leetcode.array.twopointer;

class kLengthApart {
    public boolean kLengthApart(int[] nums, int k) {

        int previous = 0;
        while (previous < nums.length && nums[previous] != 1) previous++;
        int current = previous + 1;
        while (current < nums.length) {
            if (nums[current] == 1) {
                if (current - previous - 1 < k) return false;
                previous = current;
            }
            current++;
        }
        return true;
    }
    //initially point previous to first non zero and current to previous+1
    //start 2nd loop till current is lees than nums.length
    // check for nums[current] == 1   else increase current
    // check for nums[current] == 1 and current - previous - 1 < k return false it means its not k distance apart


}