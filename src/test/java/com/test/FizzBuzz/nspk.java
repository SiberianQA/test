package com.test.FizzBuzz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class nspk {
    public static void main(String[] args) {
        String input = "один пять четыре пять семь три три три восемь ноль один десять один";
        Map<String, Integer> print= countWordN(input);
        for(Map.Entry<String, Integer> entry : print.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



    }
    public static Map<String, Integer> countWordN(String in) {
        Map<String, Integer> wordC = new HashMap<>();
        String [] word = in.split(" ");

        for (String f : word) {
            if(!wordC.containsKey(f)){
                wordC.put(f, 1);
            }
            else {
                int count = wordC.get(f);
                wordC.put(f, count+1);
            }
        }
return  wordC;
    }








}
