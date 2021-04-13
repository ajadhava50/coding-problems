package com.java8;

public class Permutation {
    public static void main(String[] args) {
        Permutation perTest=new Permutation();
        perTest.permutation("abcde");
    }

    private void permutation(String abcde) {
        permutation("abc","");
    }

    private void permutation(String str, String prefix) {
       // System.out.println("   str:"+str+" prefix:"+prefix);
        if(str.length()==0){
			return;
           // System.out.println("permutation:"+prefix);
        }
        for (int i = 0; i <str.length() ; i++) {
            String rem = str.substring(0,i) + str.substring(i+1);
            System.out.println(  "i:"+i+" rem:"+prefix);
            permutation(rem, prefix + str.charAt(i));
        }
    }
}
