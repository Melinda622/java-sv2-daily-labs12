package day05;

import java.util.*;

public class StringStatistics {

    public Map<Character,Integer> countLetters(String word){

        Map<Character,Integer> result=new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if(result.containsKey(word.charAt(i))){
                result.put(word.charAt(i), result.get(word.charAt(i))+1);
            }else{
                result.put(word.charAt(i), 1);
            }
        }
        return result;
    }
}
