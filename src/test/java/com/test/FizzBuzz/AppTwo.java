package com.test.FizzBuzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppTwo {
    public static void main(String[] args) {
        String input = "один пять четыре пять семь три три три восемь ноль один десять один";
        Map<String, Integer> wordCount = countWords(input);
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " встречается " + entry.getValue() + " раз(а)");
            }
        }
    }

    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split(" ");
        for (String word : words) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            }
        }
        return wordCount;
    }
}
