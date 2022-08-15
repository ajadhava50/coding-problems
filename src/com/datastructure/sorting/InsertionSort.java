package com.datastructure.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int a[] = {2, 7, 4, 3, 1, 6};
        insertionSort(a);
        /*int a[] = {2, 7, 4, 3, 1, 6};

        for (int i = 0; i < a.length; i++) {
            int hole = i;
            int value = a[i];
            while (hole > 0 && a[hole - 1] > value) {
                a[hole] = a[hole - 1];
                hole = hole - 1;
            }
            a[hole] = value;
        }
        Arrays.stream(a).forEach(System.out::println);*/

      /*  String name = "Abhijeet";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : name.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        map.entrySet()
                .stream()
                .forEach(e->System.out.println(e.getKey() + ":::" + e.getValue()));

        map.forEach((k, v) -> System.out.println(k + ":" + v));*/

        String s1 = "Dhanashree";
        String s2 = "Dhanashree";

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        boolean flag = true;

        flag = Arrays.equals(a1, a2);
        System.out.println(flag);



    }

//take temp inside outer loop and assign it ith value to temp
//initialize j with i-1 and in while inner run j >= 0 && nums[j] > temp
    private static void insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int temp = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
        Arrays.stream(nums).forEach(i -> System.out.print("\t" + i));

    }

    public void m1(String s) {
        System.out.println(s);
    }

    public void m1(Object s) {
        System.out.println(s);
    }
}
