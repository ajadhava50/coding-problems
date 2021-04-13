package com.leetcode.string;
/*
443. String Compression
 */
public class StringCompress {

      public int compress(char[] chars) {
            int index=0;
            int i=0;

            while(i<chars.length){
                int j=i;
                while(j<chars.length && chars[i]==chars[j]){
                    j++;
                }
                chars[index++]=chars[i];

                if(j-i>1){
                    String count=j-i +"";
                    for(char ch : count.toCharArray()){
                        chars[index++]=ch;
                    }
                }
                i=j;
            }
            return index;
        }

}
