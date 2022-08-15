package com.leetcode.array;

import java.util.LinkedList;
import java.util.List;

//989. Add to Array-Form of Integer
class AddToArrayForm {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int len = num.length - 1;
        while (len >= 0 || k != 0) {
            if (len >= 0)
                k += num[len--];
            list.addFirst(k % 10);
            k = k / 10;
        }
        return list;
    }
}
