package com.leetcode.bitmanipulation;

class FindDuplicate {
    public int[] findDuplicate(int[] nums) {
        int missing = -1;
        int duplicate = -1;
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                duplicate = Math.abs(nums[i]);
            else
                nums[index] = -1 * nums[index];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing = i;
                break;
            }
        }
        return new int[]{missing, duplicate};
    }

    public int[] findDuplicateWithBit(int[] nums) {
        int missing = -1;
        int duplicate = -1;
        int result[] = new int[]{missing, duplicate};
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x ^= nums[i];
            x ^= i + 1;
        }
        int setbit = x & ~(x - 1);
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & setbit) == 0) {
                duplicate ^= nums[i];
            } else {
                missing ^= nums[i];
                if ((i + 1 & setbit) == 0)
                    duplicate ^= i + 1;
                else
                    missing ^= i + 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == duplicate) break;
            if (nums[i] == missing) {
                int temp = missing;
                missing = duplicate;
                duplicate = missing;
            }
        }
        return result;
    }
}