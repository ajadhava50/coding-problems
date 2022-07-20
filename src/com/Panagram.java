package com;

import java.util.Locale;

//if all char from a to z is present then its panagram string
public class Panagram {

    public static void main(String[] args) {
     String s="The quick brown fox jumps over the lazy dog";
        System.out.println(isPanagram(s));
        System.out.println(isPanagram(s.toLowerCase(Locale.ROOT)));
    }

    private static boolean isPanagram(String s) {
    if(s.length()<26)return false;
        for (char i = 'a'; i <='z' ; i++) if(s.indexOf(i)<0)
                return false;
        return true;
    }
}
