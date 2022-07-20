package com.leetcode.string;

public class PushDominoes {
    public static String pushDominoes(String string) {
        int n = string.length();
        char dominoes[] = string.toCharArray();
        int forces[] = new int[n];
        int force = 0;
        for (int i = 0; i < n; i++) {
            if (dominoes[i] == 'R') {
                force = n;
            } else if (dominoes[i] == 'L') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] += force;
        }
        for (int i = n-1; i > 0; i--) {
            if (dominoes[i] == 'L') {
                force = n;
            } else if (dominoes[i] == 'R') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] -= force;
        }
        force = 0;
        StringBuilder sb = new StringBuilder();
        for (int f : forces) {
            if (f < 0) {
                sb.append("L");
            } else if (f > 0) {
                sb.append("R");
            } else {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        pushDominoes("RR.L");
    }
}
