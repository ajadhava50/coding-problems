package com.leetcode.array;

class ThirdMax {
    public int thirdMax(int[] nums) {
        
        long max=Long.MIN_VALUE;
        long second_max=Long.MIN_VALUE;
        long third_max=Long.MIN_VALUE;
        for(int num:nums){
        if(num==max||num==second_max||num==third_max)
            continue;
        
            if(num > max){
                third_max=second_max;
                second_max=max;
                max=num;
            }else if(num >= second_max){
                third_max=second_max;
                second_max=num;
            }
            else if(num >= third_max){
                 third_max=num;
            }
        }
     if (third_max != Long.MIN_VALUE)
	    return (int)third_max;
    else if (max != Long.MIN_VALUE)
	    return (int)max;
    else
	    return (int)second_max;
        
    }
}