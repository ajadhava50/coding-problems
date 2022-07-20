package com.datastructure.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class AvailableEmpForMeeting {

    public static int availableCount(String[] E) {

        Map<Integer, Integer> datesCount = new HashMap<>();
        for (int i = 0; i < E.length; i++) {
            for (int j = 0; j < E[i].length(); j++) {
                int day = E[i].charAt(j);
                datesCount.put(day, datesCount.getOrDefault(day, 0) + 1);
            }
        }
        Map topDates = datesCount.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .limit(2)
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        int count = 0;
        for (int i = 0; i < E.length; i++) {
            for (Object entry : topDates.entrySet()) {
                Map.Entry<Integer, Integer> map = (Entry<Integer, Integer>) entry;
                int dayInt = map.getKey();
                char dayChar = (char) dayInt;
                String day = "" + dayChar;
                if (E[i].contains(day))
                    count++;
            }
        }
        System.out.println(count);
        return count;
    }


    public static void main(String[] args) {
        String[] dates = {"123", "345", "", "478", "389", "239", "489", "14", ""};
        availableCount(dates);
    }

}
