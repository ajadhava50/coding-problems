package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesInArray {
    public static List<Integer> findDuplicatesJava8(int[] nums) {
        Map<Integer, Long> counts = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        counts.values().removeIf(count -> count < 2);
        return counts.entrySet().stream()
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

    }

    public static List<Integer> findDuplicates(int[] nums) {
        List outputArray = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) outputArray.add(nums[i]);
            System.out.println(index + "\t" + nums[index] + "\t" + outputArray);
            nums[index] = -nums[index];
        }

        return outputArray;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        findDuplicatesJava8(nums);
        findDuplicates(nums);

    }
}
