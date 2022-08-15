package com.leetcode.string;

import java.util.Stack;

class ScoreOfParentheses {
    public static void main(String[] args) {
        scoreOfParentheses("(()(()))");
    }

    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.add(score);
                score = 0;
            } else {
                score = stack.pop() + Math.max(score * 2, 1);
            }
            System.out.println("stack\t\t"+stack + "\t \t score:" + score);

        }
        return score;
    }
}

