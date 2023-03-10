package com.test.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class unicValue {
    public static void main(String[] args) {
        String line = "Однажды в стране и однажды в мире";
        String[] words = line.replaceAll("[^\\da-zA-Za-яёА-ЯЁ ]", "").toLowerCase().split(" ");
        List<String> uniqueWords = new ArrayList<>();

        for (int i = 0, n = words.length; i < n; i++) {
            String word = words[i];
            if (null == word) {
                continue;
            }
            boolean unique = true;
            for (int j = i + 1; j < n; j++) {
                if (word.equals(words[j])) {
                    unique = false;
                    words[j] = null;
                }
            }
            if (unique) {
                uniqueWords.add(word);
            }
        }
        System.out.println(uniqueWords);
    }
}
