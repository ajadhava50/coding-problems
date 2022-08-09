package com.datastructure.linklist;

public class DistanceBetweenBusStops {
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int totalDistance = 0;
        int clockWiseDistance = 0;
        for (int i = 0; i < distance.length; i++) {

            if (start < destination && (i >= start && i < destination)) {
                clockWiseDistance += distance[i];
            }
            if (start > destination && i >= start || i < destination) {
                System.out.println("i"+  i);
                clockWiseDistance += distance[i];
            }
            totalDistance += distance[i];
        }
        System.out.println("totalDistance"+  totalDistance);
        System.out.println("clockWiseDistance"+  clockWiseDistance);
        return Math.min(totalDistance, totalDistance - clockWiseDistance);

    }

    public static void main(String[] args) {
        int [] distancce= {1,2,3,4};
        distanceBetweenBusStops(distancce,2,1);
    }
}