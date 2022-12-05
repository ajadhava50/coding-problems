package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Perumatations {
    public static void main(String[] args) {

        Perumatations per = new Perumatations();
        System.out.println(per.permute(IntStream.of(1,2,3).toArray()));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, int start) {
        if (start == nums.length)
            result.add(toList(nums));
        else {
            for (int i = start; i < nums.length; i++) {
                swap(i, start, nums);
                backtrack(result, nums, start + 1);
                swap(i, start, nums);
            }
        }
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private List<Integer> toList(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.toList());
    }

}
