package com.datastructure.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//1389. Create Target Array in the Given Order
class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        int result[] = new int[nums.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < index.length; i++) {
            int current_index = index[i];
            if (result[current_index] != -1)
                System.out.println(result.length - current_index - 1);
                System.arraycopy(result, current_index, result, current_index + 1, result.length - current_index - 1);
            result[current_index] = nums[i];
        }

        return result;
    }
    public int[] createTargetArrayII(int[] nums, int[] index) {

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++)
            list.add(index[i], nums[i]);

        list.forEach(System.out::println);

        int[] target = new int[nums.length];
        int i = 0;
        for (int val : list) target[i++] = val;

        return target;
    }
}