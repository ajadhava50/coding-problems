package com.grind75.week6;

import java.util.ArrayList;
import java.util.List;

//78. Subsets
class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subSets = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<Integer>(), subSets);
        generateSubsets1(0, nums, new ArrayList<Integer>(), subSets);
        return subSets;
    }
    //1st approach
    public void generateSubsets1(int index, int[] nums, List<Integer> current, List<List<Integer>> subSets) {
        subSets.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets1(i + 1, nums, current, subSets);
            current.remove(current.size() - 1);
        }
    }

    //2nd approach
    public void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> subSets) {
        if (index == nums.length) {
            subSets.add(new ArrayList<Integer>(current));
            if (current.size() > 0) current.remove(current.size() - 1);
            return;
        }
        generateSubsets(index + 1, nums, add(current, nums[index]), subSets);
        generateSubsets(index + 1, nums, current, subSets);
    }

    public List<Integer> add(List<Integer> current, int num) {
        current.add(num);
        return current;
    }
}
