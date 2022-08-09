package com.corejava.string;

class AddBinary {
    public static void main(String[] args) {
        addBinary("11", "1");
    }

    public static String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i);
            if (j >= 0) sum += b.charAt(j);
            if (sum % 2 == 0) carry = 1;
            stringBuilder.append(sum % 2);
            i--;
            j--;
        }
        return stringBuilder.reverse().toString();
    }
}