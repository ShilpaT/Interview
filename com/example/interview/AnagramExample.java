package com.example.interview;

import java.util.HashMap;

public class AnagramExample {

    public static boolean isAnagram(String str1, String str2){
        boolean isAnagram = true;
        if(str1.length() != str2.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < str1.length() ; i++){
            Character currChar = str1.charAt(i);
            if(map.containsKey(currChar)) {
                map.put(currChar, map.get(currChar) + 1);
            }else{
                map.put(currChar, 1);
            }
        }

        for(int j = 0 ; j < str2.length() ; j++){
            Character current = str2.charAt(j);
            if(map.containsKey(current) && map.get(current) > 0){
                map.put(current , map.get(current) - 1);
            }else{
                isAnagram = false;
                break;
            }
        }

        return isAnagram;

    }
    public static void main(String [] args){
        System.out.println("Test class one");
        String str1 = "heart";
        String str2 = "eart";
        boolean anagram = isAnagram(str1, str2);
        System.out.println("Is anagram : " + anagram);
        System.out.println("Is anagram : " + isAnagram("ehhh", "hehh"));
        System.out.println("Is anagram : " + isAnagram("earth", "heart"));
        System.out.println("Is anagram : " + isAnagram("earth", "haart"));
    }
}
