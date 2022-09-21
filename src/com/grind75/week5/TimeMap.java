package com.grind75.week5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class TimeMap {
    Map<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new TreeMap<>());
        }
        Map<Integer, String> timeMap = map.get(key);
        timeMap.put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> timeMap = map.get(key);
        Integer prevTime = timeMap.floorKey(timestamp);
        return prevTime == null ? "" : timeMap.get(prevTime);
    }
}