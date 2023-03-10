package com.test.FizzBuzz;



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayListInHashMap {

    static Map<String, Integer> countWords() {
        Map<String, Integer> wordsCount = new HashMap<>();
        String str = "один три два";
        String[] arrayStr = str.split(" ");

        for (int i = 1; i<=arrayStr.length; i ++) {
            String ig = arrayStr[i-1];
            wordsCount.put(ig, i);
        }
        return wordsCount;

    }

    public static void main(String[] args) {
        Map<String, Integer> wordsCount = countWords();
        Set<Map.Entry<String, Integer>> o = wordsCount.entrySet();
        System.out.println(o);
    }
}
