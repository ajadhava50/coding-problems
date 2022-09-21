package com.datastructure.array;

//383. Ransom Note
class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int char_count[] = new int[26];
        for (char ch : magazine.toCharArray()) {
            char_count[ch - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()) {
            if(char_count[ch - 'a']<=0){
                return false;
            }
            char_count[ch - 'a']--;
        }
        return true;

    }
}