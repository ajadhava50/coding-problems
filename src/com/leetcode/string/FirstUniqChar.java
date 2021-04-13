package com.leetcode.string;

import java.util.*;

public class FirstUniqChar {
    public int firstUniqChar(String s) {

        Map<Character,Integer> map = new HashMap();
//s.charAt()
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,-1);
            }else{
                map.put(ch,i);
            }
        }

        int result=Integer.MAX_VALUE;
        for(char ch : map.keySet()){
            if(map.get(ch)>-1 && result > map.get(ch)){
                result=map.get(ch);
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
    //Linked Hashmap implementation
    public static int firstUniqCharLi(String s) {

        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Optional<Character> m1 =  map.entrySet()
                .stream()
                .filter(ch->ch.getValue()==1)
                .findFirst()
                .map(entry->entry.getKey());

        return 0;
    }

    public static void main(String[] args) {
        firstUniqCharLi("axsdsdaaadd");
    }


}
