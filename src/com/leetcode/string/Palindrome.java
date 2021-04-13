package com.leetcode.string;
/*
680. Valid Palindrome II
 */
class Palindrome {
    public static void main(String[] args) {

    }
    public boolean validPalindrome(String s) {

        int i=0;
        int j=s.length()-1;
        while(i<j){

            if(s.charAt(i) != s.charAt(j))
                return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
            i++;
            j--;
        }
        return true;

    }
    public boolean isPalindrome(String s,int i,int j) {

        while(i<j){
            if(s.charAt(i++) != s.charAt(j--))
                return false;
        }

        return true;

    }
}