package com.grind75.week5;
//33. Search in Rotated Sorted Array
class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
       if(nums ==null||nums.length ==0)return-1;

    int left = 0;
    int right = nums.length - 1;
    while(left <=right){
        int mid = left + (right - left) / 2;
        if (nums[mid] == target){
            return mid;
        }else if (nums[mid] >= nums[left]) {
            if (target <= nums[mid] && target >= nums[left]) {
                right = mid - 1;
            } else
                left = mid + 1;
        } else {
            if (target >= nums[mid] && target <= nums[right]) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
    }
    return-1;
    }
}