package com.leetcode.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//1773. Count Items Matching a Rule
class CountMatches {
    public static void main(String[] args) {
        List<List<String>> list = List.of(List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone"));

        System.out.println("COUNT:" + countMatches(list, "color", "silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String, Integer> map = new HashMap<>(){{
            put("type", 0);
            put("color", 1);
            put("name", 2);
        }};
        return (int) items.stream()
                .filter(list -> list.get(map.get(ruleKey)).equals(ruleValue))
                .count();
    }
}