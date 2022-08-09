package com.leetcode.string;

import java.util.ArrayList;
import java.util.List;

//763. Partition Labels
class PartitionLabels {
    public static void main(String[] args) {
        partitionLabels("ababcbacadefegdehijhklij");
    }

    public static List<Integer> partitionLabels(String s) {
        if (s == null || s.isEmpty()) return null;

        List<Integer> result = new ArrayList<>();
        int[] last_indices = new int[26];
        for (int i = 0; i < s.length() - 1; i++) {
            last_indices[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last_indices[s.charAt(i) - 'a']);
            if (end == i) {
                result.add(end - start + 1);
                start = end + 1;
            }
        }

        return result;
    }
}