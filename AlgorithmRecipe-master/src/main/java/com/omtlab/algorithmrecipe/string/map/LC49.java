package com.omtlab.algorithmrecipe.string.map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 49. Group Anagrams
 * 
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note:
 *
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
public class LC49 {

    /**
     * You can also implement same this using product of prime number 
     * 
     * Product of two prime numbers is always unique 
     * 
     * So take 256 prime numbers and assign each char one prime number. Lets say
     * a = 2
     * b = 3
     * c = 5
     * 
     * Now product of a*b = 6 which is unique you can make key of this product.
     * 
     * Generate 256 prime numbers here : https://miniwebtool.com/first-n-prime-numbers/?number=256
     */

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> asciiKeyAndList = Maps.newHashMap(); 
        
        for(String word : strs){
            String key = getKey(word);
            
            if(!asciiKeyAndList.containsKey(key)){
                asciiKeyAndList.put(key, Lists.newArrayList());
            }
            
            asciiKeyAndList.get(key).add(word);
        }
        
        List<List<String>> output = new ArrayList<>();
        output.addAll(asciiKeyAndList.values());
        return output;
    }
    
    
    public static String getKey(String word){
        int[] ascii = new int[128];
        for(Character c : word.toCharArray()){
            ascii[c]+=1;
        }
        
        return Arrays.toString(ascii);
    }
}
