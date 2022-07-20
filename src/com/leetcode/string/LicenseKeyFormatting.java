package com.leetcode.string;

//482. License Key Formatting
public class LicenseKeyFormatting {
    public static String licenseKeyFormatting(String s, int k) {
        s=s.toUpperCase();
        s=s.replaceAll("-", "");
        StringBuilder sb = new StringBuilder(s);
        for (int i = s.length() - k; i > 0; i = i - k) {
            sb.insert(i, "-");

        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println( licenseKeyFormatting("5F3Z-2e-9-w", 4));

    }
}
