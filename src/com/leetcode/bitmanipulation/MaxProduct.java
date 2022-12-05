package com.leetcode.bitmanipulation;

//318. Maximum Product of Word Lengths
class MaxProduct {

    public int maxProduct(String[] words) {
        if (words == null || words.length == 0) return 0;
        int[] wordBitVal = new int[words.length];
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            wordBitVal[i] = 0;
            for (int j = 0; j < words[i].length(); j++) {
                wordBitVal[i] |= 1 << (words[i].charAt(j) - 'a');
            }
            for (int j = 0; j < i; j++) {
                int product = words[i].length() * words[j].length();
                if ((wordBitVal[i] & wordBitVal[j]) == 0 && product > result) {
                    result = product;
                }
            }

        }
        return result;
    }
}
