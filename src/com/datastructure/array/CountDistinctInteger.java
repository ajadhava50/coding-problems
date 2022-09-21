package com.datastructure.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

//1,2,1,3,4,2,3
//Count distinct elements in every window of size k
public class CountDistinctInteger {
    public static void main(String[] args) {
        countDistinctInteger(IntStream.of(1, 2, 1, 3, 4, 2, 3).toArray(), 4);
    }

    public static List<Integer> countDistinctInteger(int nums[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        list.add(map.size());
        for (int i = k; i < nums.length; i++) {

            if (map.get(nums[i - k]) == 1)
                map.remove(nums[i - k]);
            else
                map.put(nums[i - k], map.get(nums[i - k]) - 1);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            list.add(map.size());
        }
        System.out.println(list);
        return list;
    }

}
