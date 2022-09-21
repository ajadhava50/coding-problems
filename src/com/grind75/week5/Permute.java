package com.grind75.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Permute {

    //2nd approach
    private void recurPermute(int[] nums, List<List<Integer>> result, List<Integer> ds, boolean[] freq) {
        if (ds.size() == nums.length) {
            result.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums, result, ds, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //1st approach
        //backTrack(result, nums, 0);
        // 2nd approach
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        recurPermute(nums, result, ds, freq);
        return result;
    }


    private void backTrack(List<List<Integer>> result, int[] nums, int start) {
        if (start == nums.length) {
            result.add(toList(nums));
        } else {
            for (int i = start; i < nums.length; i++) {

                swapNum(i, start, nums);
                backTrack(result, nums, start++);
                swapNum(i, start, nums);
            }
        }
    }

    private void swapNum(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private List<Integer> toList(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.toList());
    }
}