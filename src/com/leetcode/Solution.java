package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//179. Largest Number
class LargestNumber {
    public String largestNumber(int[] nums) {
        String ans = "";
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(String.valueOf(num));
        }
        Collections.sort(list, (o1, o2) -> {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s2.compareTo(s1);
        });
        for (String num : list) {
            ans = ans + num;
        }

        int start = 0;
        while (nums[start] == '0' && start < nums.length - 1) start++;
        return ans.substring(start);

    }
}